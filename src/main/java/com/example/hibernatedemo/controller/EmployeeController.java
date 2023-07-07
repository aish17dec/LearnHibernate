package com.example.hibernatedemo.controller;

import com.example.hibernatedemo.entities.Book;
import com.example.hibernatedemo.entities.Employee;
import com.example.hibernatedemo.entities.Student;
import com.example.hibernatedemo.repository.BookRepository;
import com.example.hibernatedemo.repository.StudentRepository;
import com.example.hibernatedemo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @Autowired
    StudentRepository studentRepository;


    @Autowired
    BookRepository bookRepository;

    @GetMapping(path = "/employees")
    public ResponseEntity<List<Integer>> getAllEmployees(){
        List<Integer> employeeList = employeeService.getAllEmployees();
        return new ResponseEntity<List<Integer>>(employeeList, HttpStatus.OK);
    }

    @GetMapping(path = "/demo")
    public void demo(){
        Student s =  new Student();
        Book b = new Book();
        b.setName("Operating Systems");

        s.setName("Aishwarya");
        s.getBook().add(b);
        b.setS(s);

        studentRepository.save(s);
    }


}
