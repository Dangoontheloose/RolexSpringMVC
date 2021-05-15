package com.rolex.web.validation.validator;

import com.rolex.web.service.CustomerService;
import com.rolex.web.validation.constraint.customer.login.LoginConstraint;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginValidator
        implements ConstraintValidator<LoginConstraint, Object> {

    private String email;
    private String password;
    @Autowired
    private CustomerService customerService;

    public void initialize(LoginConstraint loginConstraintAnnotation) {
        this.email = loginConstraintAnnotation.email();
        this.password = loginConstraintAnnotation.password();
    }

    public boolean isValid(Object value,
                           ConstraintValidatorContext context) {

        Object emailValue = new BeanWrapperImpl(value)
                .getPropertyValue(email);
        Object passwordValue = new BeanWrapperImpl(value)
                .getPropertyValue(password);
        boolean isEmailNotNull = !emailValue.toString().equals("");
        if (!isEmailNotNull) {
            context.disableDefaultConstraintViolation();
            context
                    .buildConstraintViolationWithTemplate("This field is required")
                    .addPropertyNode("email")
                    .addConstraintViolation();

        } else {
            if (customerService.emailNotRegistered(emailValue.toString())) {
                context.disableDefaultConstraintViolation();
                context
                        .buildConstraintViolationWithTemplate("Email not found")
                        .addPropertyNode("email")
                        .addConstraintViolation();

                return false;
            }
        }

        boolean isPasswordNotNull = !passwordValue.toString().equals("");
        if (!isPasswordNotNull) {
            context.disableDefaultConstraintViolation();
            context
                    .buildConstraintViolationWithTemplate("This field is required")
                    .addPropertyNode("password")
                    .addConstraintViolation();

        } else {
            if (!customerService.passwordCorrect(emailValue.toString(), passwordValue.toString())) {
                context.disableDefaultConstraintViolation();
                context
                        .buildConstraintViolationWithTemplate("Password not correct")
                        .addPropertyNode("password")
                        .addConstraintViolation();

                return false;
            }
        }

        return isEmailNotNull && isPasswordNotNull;

    }
}