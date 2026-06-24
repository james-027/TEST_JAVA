package com.exam.springexampractice.controller;

import com.exam.springexampractice.service.StaffService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/create/{name}")
    public String create(@PathVariable String name) {
        return staffService.createEmployee(name);
    }
}