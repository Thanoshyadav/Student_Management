package com.Student.Controller;


import com.Student.Model.Subject;
import com.Student.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {
 @Autowired
 private SubjectService subjectService;

 @GetMapping
 public ResponseEntity<List<Subject>> getAllSubjects() {
     return ResponseEntity.ok(subjectService.getAllSubjects());
 }
}

