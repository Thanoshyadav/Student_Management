package com.Student.Service;


import com.Student.Model.Subject;
import com.Student.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
 @Autowired
 private SubjectRepository subjectRepository;

 public List<Subject> getAllSubjects() {
     return subjectRepository.findAll();
 }
}
