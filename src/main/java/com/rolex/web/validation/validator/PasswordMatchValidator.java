package com.rolex.web.validation.validator;

import com.rolex.web.validation.constraint.PasswordMatchConstraint;
import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchValidator
        implements ConstraintValidator<PasswordMatchConstraint, Object> {

    private String field;
    private String fieldMatch;

    public void initialize(PasswordMatchConstraint passwordConstraintAnnotation) {
        this.field = passwordConstraintAnnotation.field();
        this.fieldMatch = passwordConstraintAnnotation.fieldMatch();
    }

    public boolean isValid(Object value,
                           ConstraintValidatorContext context) {

        Object fieldValue = new BeanWrapperImpl(value)
                .getPropertyValue(field);
        Object fieldMatchValue = new BeanWrapperImpl(value)
                .getPropertyValue(fieldMatch);
        boolean isValid = false;
        if (fieldValue != null) {
            isValid = fieldValue.equals(fieldMatchValue);
        } else {
            isValid = fieldMatchValue == null;
        }
        if ( !isValid ) {
            context.disableDefaultConstraintViolation();
            context
                    .buildConstraintViolationWithTemplate( "Passwords do not match!" )
                    .addPropertyNode( "passwordConfirm" ).addConstraintViolation();
        }

        return isValid;
    }
}