package de.samply.angularstudent.dao;

import de.samply.angularstudent.entity.Student;

import java.util.List;

public interface StudentDAO {
    void create(Student student);
    void update(Student student);
    void delete(Student student);
    List<Student> getAll();
    Student getStudentById(long id);

}
