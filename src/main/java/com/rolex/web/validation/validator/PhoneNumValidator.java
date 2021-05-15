package com.rolex.web.validation.validator;

import com.rolex.web.validation.constraint.customer.register.PhoneNumConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumValidator implements
        ConstraintValidator<PhoneNumConstraint, String> {

    @Override
    public void initialize(PhoneNumConstraint phoneNum) {
    }

    @Override
    public boolean isValid(String phoneNumField,
                           ConstraintValidatorContext cxt) {
        return !phoneNumField.equals("") && phoneNumField.matches("([+(\\d]{1})(([\\d+() -.]){5,16})([+(\\d]{1})");
    }

}
