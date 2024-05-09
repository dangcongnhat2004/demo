package com.example.demo.repository;

import com.example.demo.entity.ClassStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassStudentRepository extends JpaRepository<ClassStudent, Long> {
}
