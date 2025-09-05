package de.samply.angularstudent.controller;

import de.samply.angularstudent.dao.StudentDAO;
import de.samply.angularstudent.dao.StudentDAOImpl;
import de.samply.angularstudent.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private StudentDAO studentDAO;

    public StudentRestController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentDAO.getAll();
    }
    @GetMapping("/create")
    public String setStudent() {
        Student student = new Student("Kevin", "Doe", "janine@test.de");
        studentDAO.create(student);
        return "createt Student";
    }
}
