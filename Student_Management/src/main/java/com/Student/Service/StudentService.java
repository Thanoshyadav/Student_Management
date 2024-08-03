package com.Student.Service;


import com.Student.Model.Student;
import com.Student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
 @Autowired
 private StudentRepository studentRepository;

 public Student createStudent(Student student) {
     return studentRepository.save(student);
 }

 public List<Student> getAllStudents() {
     return studentRepository.findAll();
 }
}

