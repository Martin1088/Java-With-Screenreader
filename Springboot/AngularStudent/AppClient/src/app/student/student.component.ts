import {Component, OnInit} from '@angular/core';
import {Student, StudentService} from '../services/student.service';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-student',
  standalone: true,
  imports: [
    NgForOf
  ],
  templateUrl: './student.component.html',
  styleUrl: './student.component.scss'
})
export class StudentComponent implements OnInit {
  students: Student[] = [];

  constructor(private studentService: StudentService) {}

  ngOnInit(): void {
    this.studentService.getStudents().subscribe(data => {
      this.students = data;
    })
  }
}
