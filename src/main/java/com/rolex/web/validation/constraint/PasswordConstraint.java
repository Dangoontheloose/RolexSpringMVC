package com.rolex.web.validation.constraint;

import com.rolex.web.validation.validator.PasswordValidator;
import com.rolex.web.validation.validator.PhoneNumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordConstraint {
    String message() default "Password: must be 8 characters minimum, must contain at least 1 uppercase letter, 1 digit";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}