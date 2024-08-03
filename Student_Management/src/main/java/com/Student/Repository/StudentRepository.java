package com.Student.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

