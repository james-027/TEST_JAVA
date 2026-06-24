package com.exam.springexampractice.validator;

import org.springframework.stereotype.Component;

@Component
public class BasicStaffValidator implements StaffValidator {

    @Override
    public boolean isValid(String name) {
        return name != null && !name.trim().isEmpty();
    }
}