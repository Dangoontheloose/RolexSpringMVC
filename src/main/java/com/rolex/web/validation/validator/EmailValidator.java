package com.rolex.web.validation.validator;

import com.rolex.web.validation.constraint.EmailConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements
        ConstraintValidator<EmailConstraint, String> {

    @Override
    public void initialize(EmailConstraint email) {
    }

    @Override
    public boolean isValid(String emailField,
                           ConstraintValidatorContext cxt) {
        return !emailField.equals("") && emailField.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

}