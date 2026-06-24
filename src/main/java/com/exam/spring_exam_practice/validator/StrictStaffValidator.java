package com.exam.springexampractice.validator;

import org.springframework.stereotype.Component;

@Component
public class StrictStaffValidator implements StaffValidator {

    @Override
    public boolean isValid(String name) {
        return name != null 
                && name.length() >= 5
                && name.matches("[a-zA-Z ]+");
    }
}