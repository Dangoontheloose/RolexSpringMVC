package com.rolex.web.controller;

import com.rolex.web.service.ProductService;

import com.rolex.web.viewmodel.AddToCartForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ProductController {
    @Autowired
    private final ProductService productService;


    public ProductController() {
        productService = new ProductService();
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("product", productService.getProductList());
        return "home";
    }

    @GetMapping("/product/{id}")
    public String productDetail(@PathVariable("id") String id, Model model) {
        model.addAttribute("addToCartForm", new AddToCartForm());
        model.addAttribute("product", productService.getProductVMFromID(id));
        return "product-details";
    }
}
