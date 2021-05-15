package com.rolex.web.validation.constraint.customer.login;

import com.rolex.web.validation.validator.LoginValidator;
import com.rolex.web.validation.validator.PasswordConfirmValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = LoginValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginConstraint {

    String message() default "Fields value does not match!";

    String email();

    String password();

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    @Target({ ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        com.rolex.web.validation.constraint.customer.login.LoginConstraint[] value();
    }
}