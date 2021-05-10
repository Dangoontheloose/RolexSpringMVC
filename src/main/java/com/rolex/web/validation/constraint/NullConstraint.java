package com.rolex.web.validation.constraint;

import com.rolex.web.validation.validator.NullValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Constraint(validatedBy = NullValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface NullConstraint {
    String message() default "This field is required";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}