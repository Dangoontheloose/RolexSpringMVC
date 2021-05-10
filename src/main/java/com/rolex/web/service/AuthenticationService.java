package com.rolex.web.service;

import com.rolex.web.model.Customer;
import com.rolex.web.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private CustomerRepository customerRepository;

    public boolean SignUpValidate(Customer customer) {
        return true;
    }
}
