package com.rolex.web.controller;

import com.rolex.web.model.Product;
import com.rolex.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductController {
    @Autowired
    private final ProductService productService;
    public ProductController() { productService = new ProductService(); }

    @GetMapping("/pro")
    public String pro(Model model) {
        model.addAttribute("product", productService.getAllProduct());
        return "product";
    }
    @PostMapping("/pro/create")
    public String save() {
        Product product = new Product();
        product.setProductID("AA22");
        product.setDescription("dfd");
        product.setPrice(20);
        product.setStock(10);
        product.setImg("fe");
        product.setCollectionID(1);

        productService.saveProduct(product);

        return "home";
    }
}
