import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Student {
  id: number;
  firstName: string;
  lastName: string;
  email: string;
}

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private apiUrl = '/api/students';

  constructor(private http: HttpClient) {}

  getStudents(): Observable<Student[]> {
    var test = this.http.get<Student[]>(this.apiUrl);
    console.log(test);
    return test;
  }
}
