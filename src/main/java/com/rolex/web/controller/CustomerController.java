package com.rolex.web.controller;

import com.rolex.web.repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController() {
        this.customerRepository = new CustomerRepository();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String customer(Model model) {
        model.addAttribute("customerList", customerRepository.getCustomerList());
        return "customer-list";
    }
}