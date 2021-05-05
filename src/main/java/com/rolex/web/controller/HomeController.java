package com.rolex.web.controller;

import com.rolex.web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    private  CustomerService customerService;

    public HomeController() {
        this.customerService = new CustomerService();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String customer(Model model) {
        model.addAttribute("customerList", customerService.getCustomerList());
        return "customer-list";
    }
    @RequestMapping(value = "/one", method = RequestMethod.GET)
    public String one(Model model) {
        model.addAttribute("customer", customerService.getFirstCustomer());
        return "one";
    }
    @RequestMapping(value ="/home", method = RequestMethod. GET )
    public String home(Model model){
        return "two";
    }
}