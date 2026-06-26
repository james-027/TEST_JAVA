package com.exam.springexampractice.service;

import com.exam.springexampractice.entity.Student;
import com.exam.springexampractice.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // Create
    public Student create(Student student) {
        return repository.save(student);
    }

    // Read All
    public List<Student> findAll() {
        return repository.findAll();
    }

    // Read One
    public Student findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Update
    public Student update(Long id, Student updatedStudent) {

        Student student = repository.findById(id).orElse(null);

        if (student == null) {
            return null;
        }

        student.setName(updatedStudent.getName());
        student.setAge(updatedStudent.getAge());
        student.setCourse(updatedStudent.getCourse());

        return repository.save(student);
    }

    // Delete
    public void delete(Long id) {
        repository.deleteById(id);
    }
}