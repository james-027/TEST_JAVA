package com.exam.springexampractice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {

    public String getMessage() {
        return "Spring Exam Success";
    }
}