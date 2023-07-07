package com.example.hibernatedemo;

import com.example.hibernatedemo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(HibernateDemoApplication.class, args);
    }

}
