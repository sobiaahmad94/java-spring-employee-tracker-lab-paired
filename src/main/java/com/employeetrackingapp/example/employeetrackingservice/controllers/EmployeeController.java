package com.employeetrackingapp.example.employeetrackingservice.controllers;

import com.employeetrackingapp.example.employeetrackingservice.models.Employee;
import com.employeetrackingapp.example.employeetrackingservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController

public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }
}
