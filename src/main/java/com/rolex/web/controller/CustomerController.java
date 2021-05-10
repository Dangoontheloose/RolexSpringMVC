package com.rolex.web.controller;


import com.rolex.web.service.CustomerService;
import com.rolex.web.viewmodel.CheckNull;
import com.rolex.web.viewmodel.CheckOthers;
import com.rolex.web.viewmodel.RegisterViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.GroupSequence;
import javax.validation.Valid;

@GroupSequence({ CheckNull.class, CheckOthers.class})
interface OrderedChecks {}

@Controller
public class CustomerController {
    @Autowired
    private final CustomerService customerService;

    public CustomerController() {
        customerService = new CustomerService();
    }

    @ModelAttribute("registerViewModel")
    public RegisterViewModel setRegisterViewModel() {
        return new RegisterViewModel();
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

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("registerViewModel", setRegisterViewModel());
        return "register";
    }

    @PostMapping("/register-submit")
    public String postRegister(@Validated(OrderedChecks.class) @ModelAttribute("registerViewModel") RegisterViewModel registerViewModel, BindingResult br, Model model) {
        if (br.hasErrors()) {
            return "register";
        }
        return "home";
    }
}