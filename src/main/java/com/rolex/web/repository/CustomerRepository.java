package com.rolex.web.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.rolex.web.model.Customer;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> getCustomerList();
    Customer findCustomerByName(String name);
}
