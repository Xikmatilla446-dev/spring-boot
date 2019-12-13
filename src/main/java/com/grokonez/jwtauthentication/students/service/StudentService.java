package com.grokonez.jwtauthentication.students.service;

import com.grokonez.jwtauthentication.students.model.Student;

import java.util.List;

public interface StudentService {

    Iterable<Student> listStudent();

    Student saveStudent(Student student);

    boolean deleteStudent(Long id);

     List<Student> getById(Long id);


}
