import {RouterOutlet} from '@angular/router';
import {catchError, firstValueFrom, Observable, of, throwError} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {AsyncPipe, JsonPipe, NgIf} from '@angular/common';
import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, JsonPipe, NgIf, AsyncPipe],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  me$?: Observable<any>;
  token$?: Observable<any>;
  error = '';

  constructor(private http: HttpClient) {
  }

  login() {
    window.location.href = '/oauth2/authorization/authentik';
  }

  whoAmI() {
    this.error = '';
    this.me$ = this.http.get('/api/me')  // proxy sends to http://localhost:8060/api/me
      .pipe(
        catchError(err => {
          this.error = `Error ${err.status}: ${err.statusText}`;
          return of(null);
        })
      );
  }

  getToken() {
    this.error = '';
    this.token$ = this.http.get('/api/token')
      .pipe(
        catchError(err => {
          this.error = `Error ${err.status}: ${err.statusText}`;
          return of(null);
        })
      );
  }

  async getAccessToken() {
    this.error = '';
    try {
      const accessToken = await firstValueFrom(
        this.http.get('/api/access_token', {responseType: 'text'})
          .pipe(
            catchError(err => {
              this.error = `Error ${err.status}: ${err.statusText}`;
              return throwError(() => err);
            })
          )
      );
      await navigator.clipboard.writeText(accessToken);
      console.log('Token copied to clipboard:', accessToken);

    } catch (err: any) {
      this.error = `Error ${err.status || ''}: ${err.statusText || err.message || 'Clipboard or fetch failed'}`;
      console.error(this.error);
    }
  }

  logout() {
    fetch('/logout', {
      method: 'POST',
      credentials: 'include'
    }).then(() => window.location.href = '/');
  }

  private readCookie(name: string): string {
    return document.cookie
      .split('; ')
      .find(c => c.startsWith(name + '='))?.split('=')[1] ?? '';
  }
}
