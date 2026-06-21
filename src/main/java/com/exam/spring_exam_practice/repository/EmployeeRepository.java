package com.exam.springexampractice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository{
    
    public String findEmployeeById(int id){
        return "Employee ID" + id;
    }

    public String findEmployeeByName(String name){
        return "Empoyee Name " + name;
    }
}