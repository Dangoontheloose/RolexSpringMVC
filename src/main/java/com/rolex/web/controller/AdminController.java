package com.rolex.web.controller;

import com.rolex.web.model.Collection;
import com.rolex.web.model.WatchSize;
import com.rolex.web.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private final CustomerService customerService;
    @Autowired
    private final ProductService productService;
    @Autowired
    private final CartService cartService;
    @Autowired
    private final CollectionService collectionService;
    @Autowired
    private WatchTypeService watchTypeService;
    @Autowired
    private WatchSizeService watchSizeService;


    public AdminController() {
        customerService = new CustomerService();
        productService = new ProductService();
        cartService = new CartService();
        collectionService = new CollectionService();
    }

    @GetMapping("/customer/add")
    public String addCustomer(Model model) {
           model.addAttribute("collectionList", collectionService.getCollectionList());
           return "admin-customer-add";
    }

    @GetMapping("/customer")
    public String listCustomer(Model model) {
        model.addAttribute("customerList", customerService.getCustomerList());
        return "admin-customer-list";
    }

    @GetMapping("/product")
    public String listProduct(Model model) {
        model.addAttribute("productList", productService.getProductList());
        return "admin-product-list";
    }

    @GetMapping("/product/add")
    public String addProduct(Model model) {
        model.addAttribute("sizeList", watchSizeService.getSizeList());
        model.addAttribute("typeList", watchTypeService.getWatchTypeList());
        model.addAttribute("collectionList", collectionService.getCollectionList());

        return "admin-customer-add";
    }

    @GetMapping("/collection/add")
    public String addCollection(Model model) {
        model.addAttribute("collection", new Collection());
        return "admin-collection-add";
    }

    @PostMapping("/collection/add-submit")
     public String postAddCollection(@Valid @ModelAttribute("collection") Collection collection, BindingResult br) {
        if (br.hasErrors()) {
            return "admin-collection-add";
        }
        collectionService.addCollection(collection);
        return "home";
    }

    @PostMapping("/collection/add-submit")
    public String postAddSize(@Valid @ModelAttribute("watchSize") WatchSize watchSize, BindingResult br) {
        if (br.hasErrors()) {
            return "admin-collection-add";
        }
        watchSizeService.addWatchSize(watchSize);
        return "home";
    }


}
