package com.exam.springexampractice.controller;

import com.exam.springexampractice.entity.Student;
import com.exam.springexampractice.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.create(student);
    }

    // READ ALL
    @GetMapping
    public List<Student> findAll() {
        return service.findAll();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Student findById(@PathVariable Long id) {
        return service.findById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student update(
            @PathVariable Long id,  @RequestBody Student student) {

        return service.update(id, student);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {

        service.delete(id);

        return "Student deleted successfully!";
    }
}