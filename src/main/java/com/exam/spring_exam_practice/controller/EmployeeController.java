package com.exam.springexampractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.exam.springexampractice.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController{
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}/details")
    public String getEmployeeId(@PathVariable int id, @RequestParam String department){
                    return "ID " + id + " Department " + department;

    }

    @GetMapping
        public String getName(@RequestParam String name ,@RequestParam String department){
            return "Name " + name + " Department " + department;
        }

    

}