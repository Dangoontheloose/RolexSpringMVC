package com.rolex.web.validation.constraint.collection;

import com.rolex.web.validation.validator.ConflictValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Constraint(validatedBy = ConflictValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConflictConstraint {
    String message() default "Cannot delete: currently being used by other product";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}