package com.rolex.web.service;

import com.rolex.web.model.Customer;
import com.rolex.web.repository.CustomerRepository;
import com.rolex.web.viewmodel.CustomerProfileEditVM;
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

    public CustomerProfileEditVM getCustomerByCustomerID(String customerID) {
        Customer customer = customerRepository.findByCustomerID(customerID);

        return new CustomerProfileEditVM() {{
            setCustomerID(customerID);
            setName(customer.getName());
            setAddress(customer.getAddress());
            setEmail(customer.getEmail());
            setPhoneNum(customer.getPhoneNum());
        }};
    }
    public void updateCustomer(CustomerProfileEditVM customerProfileEditVM) {
        Customer customer = customerRepository.findByCustomerID(customerProfileEditVM.getCustomerID());
        if (customer != null) {
            customer.setAddress(customerProfileEditVM.getAddress());
            customer.setEmail(customerProfileEditVM.getEmail());
            customer.setPhoneNum(customerProfileEditVM.getPhoneNum());
            customer.setName(customerProfileEditVM.getName());

            customerRepository.save(customer);
        }
    }

    public String getCustomerIDByEmail(String email) {
        Customer customer = customerRepository.findByEmail(email);
        return customer.getCustomerID();
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

    public boolean emailNotRegistered(String email) {
        Customer customer = customerRepository.findByEmail(email);
        return customer == null;
    }

    public boolean passwordCorrect(String email, String password) {
        return customerRepository.findByEmailAndPassword(email, password) != null;
    }
}
