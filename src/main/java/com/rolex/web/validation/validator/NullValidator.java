package com.rolex.web.validation.validator;

import com.rolex.web.validation.constraint.customer.NullConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NullValidator implements
        ConstraintValidator<NullConstraint, String> {

    @Override
    public void initialize(NullConstraint field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        return !field.equals("");
    }

}
