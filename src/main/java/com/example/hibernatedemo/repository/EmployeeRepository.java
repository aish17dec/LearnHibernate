package com.example.hibernatedemo.repository;

import com.example.hibernatedemo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    public List<Employee> getEmployeesBySalaryBetween(long s1,long s2);

    public List<Employee> getEmployeesByFirstNameStartingWith(char a);

    public List<Employee> getEmployeesByOfficeId(int officeId);

    @Query("select distinct e.officeId FROM Employee e")
    public List<Integer> getDistinctByOfficeId();

}
