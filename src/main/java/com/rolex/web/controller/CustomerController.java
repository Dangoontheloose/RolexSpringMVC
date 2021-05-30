package com.rolex.web.controller;


import com.rolex.web.service.CustomerService;
import com.rolex.web.viewmodel.LoginForm;
import com.rolex.web.viewmodel.RegisterViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

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
    public String postRegister(@Valid @ModelAttribute("registerViewModel") RegisterViewModel registerViewModel, BindingResult br, Model model) {
        if (br.hasErrors()) {
            return "register";
        }
        customerService.registerCustomer(registerViewModel);
        return "register-success";
    }
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("loginForm", new LoginForm());

        return "login";
    }

    @PostMapping("/login-submit")
    public String postLogin(@Valid @ModelAttribute("loginForm") LoginForm loginForm, BindingResult br, Model model, HttpSession session) {
        if (br.hasErrors()) {
            return "login";
        }
        session.setAttribute("email", loginForm.getEmail());
        return "login-success";
    }

    @GetMapping("/login-success")
    public String loginSuccess() {
        return "login-success";
    }

}