package com.rolex.web.validation.validator;

import com.rolex.web.service.ProductService;
import com.rolex.web.validation.constraint.collection.ConflictConstraint;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ConflictValidator implements ConstraintValidator<ConflictConstraint, String> {
    @Autowired
    ProductService productService;

    @Override
    public void initialize(ConflictConstraint conflict) {
    }

    @Override
    public boolean isValid(String collectionIDField, ConstraintValidatorContext cxt) {
        boolean isNotUsed = productService.collectionIDNotUsed(Integer.parseInt(collectionIDField));
        if (!isNotUsed) {
            cxt.disableDefaultConstraintViolation();
            cxt
                    .buildConstraintViolationWithTemplate("Cannot delete collection: currently being used by other product")
//                    .addPropertyNode("collectionID")
                    .addConstraintViolation();

            return false;
        }
        return true;
    }
}
