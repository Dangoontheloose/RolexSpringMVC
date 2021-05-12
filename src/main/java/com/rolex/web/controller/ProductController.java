package com.rolex.web.controller;

import com.rolex.web.model.Product;
import com.rolex.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductController {
    @Autowired
    private final ProductService productService;
    public ProductController() { productService = new ProductService(); }

    @GetMapping("/pro")
    public String pro(Model model) {
        model.addAttribute("product", productService.getProductList());
        return "product";
    }

    @GetMapping("/product/{id}")
    public String productListByCollectionID(@PathVariable("id") int id, Model model) {
        model.addAttribute("productList", productService.sortProductByCollectionID(id));
        return "product";
    }
}
