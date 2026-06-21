package com.exam.springexampractice.controller;

import com.exam.springexampractice.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationContextController {

    private final ApplicationContext applicationContext;

    public ApplicationContextController(
            ApplicationContext applicationContext
    ) {
        this.applicationContext = applicationContext;
    }

    @GetMapping("/context")
    public String testContext() {

        EmployeeService employeeService =
                applicationContext.getBean(EmployeeService.class);

        return employeeService.getEmployeeId(100);
    }
}