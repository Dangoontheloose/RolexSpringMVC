package com.rolex.web.validation.validator;

import com.rolex.web.service.CustomerService;
import com.rolex.web.validation.constraint.customer.EmailConstraint;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements
        ConstraintValidator<EmailConstraint, String> {
    @Autowired
    CustomerService customerService;
    @Override
    public void initialize(EmailConstraint email) {
    }

    @Override
    public boolean isValid(String emailField,
                           ConstraintValidatorContext cxt) {
        boolean isNotNull = !emailField.equals("");
        if ( !isNotNull ) {
            cxt.disableDefaultConstraintViolation();
            cxt
                    .buildConstraintViolationWithTemplate( "This field is required" )
                    .addConstraintViolation();

            return false;
        }
        boolean isFormatValid = emailField.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        if ( !isFormatValid ) {
            cxt.disableDefaultConstraintViolation();
            cxt
                    .buildConstraintViolationWithTemplate( "Invalid email format" )
                    .addConstraintViolation();

            return false;
        }
        boolean isNotRegistered = customerService.emailNotRegistered(emailField);
        if ( !isNotRegistered ) {
            cxt.disableDefaultConstraintViolation();
            cxt
                    .buildConstraintViolationWithTemplate( "This email is already registered" )
                    .addConstraintViolation();

            return false;
        }
        return true;
    }

}