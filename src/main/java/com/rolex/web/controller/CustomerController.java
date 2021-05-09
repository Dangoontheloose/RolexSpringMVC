package com.rolex.web.controller;


import com.rolex.web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CustomerController {
    @Autowired
    private final CustomerService customerService;

    public CustomerController() {
        customerService = new CustomerService();
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/customers")
    public String customer(Model model) {
        model.addAttribute("customerList", customerService.getCustomerList());
        return "customer-list";
    }
}