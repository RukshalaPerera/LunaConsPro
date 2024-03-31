package com.example.demo.controller;

import com.example.demo.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.employeeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class employeeController {
    @Autowired
    private employeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
