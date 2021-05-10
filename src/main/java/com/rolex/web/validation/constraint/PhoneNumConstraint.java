package com.rolex.web.validation.constraint;

import com.rolex.web.validation.validator.PhoneNumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Constraint(validatedBy = PhoneNumValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumConstraint {
    String message() default "Invalid phone number format (null or contains letter)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
