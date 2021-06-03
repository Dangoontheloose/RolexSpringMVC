package com.rolex.web.controller;

import com.rolex.web.model.Collection;
import com.rolex.web.model.WatchSize;
import com.rolex.web.model.WatchType;
import com.rolex.web.service.*;
import com.rolex.web.viewmodel.CollectionForm;
import com.rolex.web.viewmodel.AdminProductVM;
import com.rolex.web.viewmodel.SizeForm;
import com.rolex.web.viewmodel.TypeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private MaterialService materialService;


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
        addModelsToProductList(model);

        model.addAttribute("collectionForm", new CollectionForm());
        model.addAttribute("typeForm", new TypeForm());
        model.addAttribute("sizeForm", new SizeForm());
//        model.addAttribute("materialForm", new MaterialForm());

        return "admin-product-list";
    }

    @GetMapping("/product/add")
    public String addProduct(Model model) {
        model.addAttribute("productForm", new AdminProductVM());

        model.addAttribute("sizeList", watchSizeService.getSizeList());
        model.addAttribute("typeList", watchTypeService.getWatchTypeList());
        model.addAttribute("collectionList", collectionService.getCollectionList());

        return "admin-product-add";
    }

    // TODO: Add Edit > Product
    @PostMapping("/product/add-product-submit")
    public String postAddProduct(@Valid @ModelAttribute("productForm") AdminProductVM productForm, BindingResult br, Model model) {
        if(!br.hasErrors()) {
            productService.addProduct(productForm);
            return "redirect:/admin/product";
        }
        model.addAttribute("sizeList", watchSizeService.getSizeList());
        model.addAttribute("typeList", watchTypeService.getWatchTypeList());
        model.addAttribute("collectionList", collectionService.getCollectionList());

        return "admin-product-add";
    }

    @PostMapping("/product/add-collection-submit")
    public String postAddCollection(@Valid @ModelAttribute("collection") Collection collection, BindingResult br, Model model) {
        if (!br.hasErrors()) {
            collectionService.updateCollection(collection);
            return "redirect:/admin/product";
        }
        addModelsToProductList(model);

        model.addAttribute("sizeList", watchSizeService.getSizeList());
        model.addAttribute("typeList", watchTypeService.getWatchTypeList());
        return "admin-product-list";
    }

    @PostMapping("/product/add-size-submit")
    public String postAddSize(@Valid @ModelAttribute("watchSize") WatchSize watchSize, BindingResult br, Model model) {
        if (!br.hasErrors()) {
            watchSizeService.updateWatchSize(watchSize);
            return "redirect:/admin/product";
        }
        addModelsToProductList(model);
        model.addAttribute("collection", new Collection());
        model.addAttribute("watchType", new WatchType());

        return "admin-product-list";
    }

    @PostMapping("/product/add-type-submit")
    public String postAddType(@Valid @ModelAttribute("WatchType") WatchType watchType, BindingResult br, Model model) {
        if (!br.hasErrors()) {
            watchTypeService.updateWatchType(watchType);
            return "redirect:/admin/product";
        }
        addModelsToProductList(model);
        model.addAttribute("watchSize", new WatchSize());
        model.addAttribute("collection", new Collection());

        return "admin-product-list";
    }

    @PostMapping("/product/delete-collection-submit/{id}")
    public String postDeleteCollection(@PathVariable("id") int id, @Valid @ModelAttribute("collectionForm") CollectionForm collectionForm, BindingResult br, Model model) {
        if (!br.hasErrors()) {
            collectionService.deleteCollectionByCollectionID(id);
            return "redirect:/admin/product";

        }
       addModelsToProductList(model);

        model.addAttribute("typeForm", new TypeForm());
        model.addAttribute("sizeForm", new SizeForm());
        return "admin-product-list";
    }
    @PostMapping("/product/delete-size-submit/{id}")
    public String postDeleteSize(@PathVariable("id") int id, @Valid @ModelAttribute("sizeForm") SizeForm sizeForm, BindingResult br, Model model) {
        if (!br.hasErrors()) {
            watchSizeService.deleteWatchSizeBySizeID(id);
            return "redirect:/admin/product";

        }
        addModelsToProductList(model);

        model.addAttribute("typeForm", new TypeForm());
        model.addAttribute("collectionForm", new CollectionForm());
        return "admin-product-list";
    }

        @PostMapping("/product/delete-type-submit/{id}")
        public String postDeleteType(@PathVariable("id") int id, @Valid @ModelAttribute("typeForm") TypeForm typeForm, BindingResult br, Model model) {
            if (!br.hasErrors()) {
                watchTypeService.deleteWatchTypeByWatchTypeID(id);
                return "redirect:/admin/product";

            }
            addModelsToProductList(model);

            model.addAttribute("sizeForm", new SizeForm());
            model.addAttribute("collectionForm", new CollectionForm());
            return "admin-product-list";
        }

    private void addModelsToProductList(Model model) {
        model.addAttribute("productList", productService.getProductVMList());
        model.addAttribute("collectionList", collectionService.getCollectionList());
        model.addAttribute("watchTypeList", watchTypeService.getWatchTypeList());
        model.addAttribute("sizeList", watchSizeService.getSizeList());
        model.addAttribute("materialList", materialService.getMaterialList());

        model.addAttribute("collection", new Collection());
        model.addAttribute("watchType", new WatchType());
        model.addAttribute("watchSize", new WatchSize());
    }
}
