package com.rolex.web.service;

import com.rolex.web.model.Customer;
import com.rolex.web.repository.CustomerRepository;
import com.rolex.web.viewmodel.RegisterViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomerList() {
        return customerRepository.findAll();
    }

    public void registerCustomer(RegisterViewModel registerViewModel) {
        Customer customer = new Customer();
        customer.setName(String.format("%s %s", registerViewModel.getFirstName(), registerViewModel.getLastName()));
        customer.setAddress(registerViewModel.getAddress());
        customer.setEmail(registerViewModel.getEmail());
        customer.setPassword(registerViewModel.getPassword());
        customer.setPhoneNum(registerViewModel.getPhoneNumber());
        customer.setAccountTypeID(2);

        customerRepository.insert(customer);
    }
}
