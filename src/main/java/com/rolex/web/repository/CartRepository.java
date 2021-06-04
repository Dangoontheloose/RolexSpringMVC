package com.rolex.web.repository;

import com.rolex.web.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart, String> {
    Cart findByState(String state);
    Cart findByCustomerID(String customerID);
}
