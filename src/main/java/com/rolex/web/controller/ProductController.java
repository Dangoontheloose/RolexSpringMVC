package com.rolex.web.controller;

import com.rolex.web.service.*;

import com.rolex.web.viewmodel.AddToCartForm;

import com.rolex.web.viewmodel.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;


@Controller
public class ProductController {
    @Autowired
    private final ProductService productService;
    @Autowired
    private final CollectionService collectionService;
    @Autowired
    private final MaterialService materialService;
    @Autowired
    private final WatchSizeService watchSizeService;
    @Autowired
    private final WatchTypeService watchTypeService;


    public ProductController() {
        productService = new ProductService();
        collectionService = new CollectionService();
        materialService = new MaterialService();
        watchSizeService = new WatchSizeService();
        watchTypeService = new WatchTypeService();
    }
    @GetMapping("/")
    public String index(Model model){
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }
    @GetMapping("/product")
    public String product(Model model, HttpSession session) {
        model.addAttribute("collectionList", collectionService.getCollectionList());
        model.addAttribute("materialList", materialService.getMaterialList());
        model.addAttribute("sizeList", watchSizeService.getSizeList());
        model.addAttribute("typeList", watchTypeService.getWatchTypeList());

        Filter filter = (Filter) session.getAttribute("filter");

        if (filter != null) {
            model.addAttribute("filter", filter);
            model.addAttribute("product", productService.getProductListWithFilter(filter));
            return "product";
        }
        model.addAttribute("filter", new Filter());
        model.addAttribute("product", productService.getProductListWithFilter());

        return "product";
    }

    @PostMapping("/apply-filter")
    public String applyFilter(Filter filter, Model model, HttpSession session) {
        session.setAttribute("filter", filter);

        return "redirect:/product";
    }

    @GetMapping("/product/{id}")
    public String productDetail(@PathVariable("id") String id, Model model) {
        model.addAttribute("addToCartForm", new AddToCartForm());
        model.addAttribute("product", productService.getProductVMFromID(id));
        return "product-details";
    }
}
