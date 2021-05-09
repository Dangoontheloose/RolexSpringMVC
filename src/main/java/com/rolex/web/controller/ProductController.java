package com.rolex.web.controller;

import com.rolex.web.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
    private ProductRepository productRepository;

    public ProductController() { }

    @RequestMapping(value = "/pro", method = RequestMethod.GET)
    public String pro(Model model) {
        model.addAttribute("product", productRepository.findByCollectionName("Submariner"));
        return "product";
    }
}
