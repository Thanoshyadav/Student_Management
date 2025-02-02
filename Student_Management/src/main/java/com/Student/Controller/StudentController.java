package com.Student.Controller;


import com.Student.Model.Student;
import com.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
 @Autowired
 private StudentService studentService;

 @PostMapping
 public ResponseEntity<Student> createStudent(@RequestBody Student student) {
     return ResponseEntity.ok(studentService.createStudent(student));
 }

 @GetMapping
 public ResponseEntity<List<Student>> getAllStudents() {
     return ResponseEntity.ok(studentService.getAllStudents());
 }
}

