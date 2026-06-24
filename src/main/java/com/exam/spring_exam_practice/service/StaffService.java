package com.exam.springexampractice.service;

import com.exam.springexampractice.validator.StaffValidator;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

@Service
public class StaffService {

    private final StaffValidator validator;

    public StaffService(@Qualifier("basicStaffValidator")StaffValidator validator) {
        this.validator = validator;
    }

    public String createEmployee(String name) {

        if (!validator.isValid(name)) {
            return "❌ Invalid employee name";
        }

        return "✅ Employee created: " + name;
    }
}