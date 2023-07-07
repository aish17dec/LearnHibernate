package com.example.hibernatedemo.service;

import com.example.hibernatedemo.entities.Employee;
import com.example.hibernatedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EmployeeServiceImpl {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Integer> getAllEmployees(){

        List<Integer> employeeList = employeeRepository.getDistinctByOfficeId();
        //List<Employee> employeeList = employeeRepository.getEmployeesByOfficeId(4);

        //List<Employee> employeeList = employeeRepository.getEmployeesByFirstNameStartingWith('e');
        //List<Employee> employeeList = employeeRepository.getEmployeesBySalaryBetween(20000, 60000);
        return employeeList;
    }
}
