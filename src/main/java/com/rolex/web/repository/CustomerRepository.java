package com.rolex.web.repository;


import com.rolex.web.model.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByEmail(String email);
    Customer findByCustomerID(String customerID);
    Customer findByEmailAndPassword(String email, String password);
}
