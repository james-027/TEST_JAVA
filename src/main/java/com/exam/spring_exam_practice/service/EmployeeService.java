package com.exam.springexampractice.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.exam.springexampractice.repository.EmployeeRepository;

@Service
public class EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public String getEmployeeId(int id){
        return employeeRepository.findEmployeeById(id);
    }

    public String getName(String name){
        return employeeRepository.findEmployeeByName(name);
    }
    
}