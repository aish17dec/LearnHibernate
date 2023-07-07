package com.example.hibernatedemo.repository;

import com.example.hibernatedemo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
