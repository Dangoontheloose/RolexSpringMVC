package com.rolex.web.controller;

import com.rolex.web.service.CartService;
import com.rolex.web.service.ProductService;

import com.rolex.web.viewmodel.AddToCartForm;
import com.rolex.web.viewmodel.CartQuantityForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller
public class ProductController {
    @Autowired
    private final ProductService productService;
    @Autowired
    private final CartService cartService;

    public ProductController() {
        productService = new ProductService();
        cartService = new CartService();
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("product", productService.getProductList());
        return "home";
    }

    @GetMapping("/cart")
    public String cart(Model model, HttpSession session) {
        List<AddToCartForm> cartList = (List<AddToCartForm>) session.getAttribute("cart");
        if (cartList != null) {
            model.addAttribute("cartList", cartList);
            model.addAttribute("cartForm", new CartQuantityForm());
        }
        return "cart";
    }

    @PostMapping("/cart/update-quantity")
    public String updateCartQuantity(CartQuantityForm cartForm, HttpSession session) {
        List<AddToCartForm> cartList = (List<AddToCartForm>) session.getAttribute("cart");
        cartList = cartService.updateQuantity(cartList, cartForm);
        session.setAttribute("cart", cartList);
        session.setAttribute("cartSize", cartList.size());
        return "redirect:/cart";
    }

    @PostMapping("/move-to-checkout")
    public String moveToCheckout(HttpSession session, Model model) {
        if (session.getAttribute("email") != null) {
            return "redirect:/checkout";
        }
        return "redirect:/login";
    }

    @GetMapping("/product/{id}")
    public String productDetail(@PathVariable("id") String id, Model model) {
        model.addAttribute("addToCartForm", new AddToCartForm());
        model.addAttribute("product", productService.getProductVMFromID(id));
        return "product-details";
    }

    @PostMapping("/product/add-to-cart")
    public String addToCart(AddToCartForm addToCartForm, HttpSession session) {
        List<AddToCartForm> cartList = (List<AddToCartForm>) session.getAttribute("cart");
        if (cartList == null) {
            cartList = new ArrayList<>();
        }
            cartList = cartService.addToTempCart(cartList, addToCartForm);
            session.setAttribute("cart", cartList);
            session.setAttribute("cartSize", cartList.size());

            return "redirect:/";
    }
}
