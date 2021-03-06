package com.rolex.web.controller;

import com.rolex.web.service.CartService;
import com.rolex.web.service.CustomerService;
import com.rolex.web.viewmodel.AddToCartForm;
import com.rolex.web.viewmodel.CartQuantityForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CartController {
    @Autowired
    private final CartService cartService;
    private final CustomerService customerService;

    public CartController() {
        cartService = new CartService();
        customerService = new CustomerService();
    }

    @GetMapping("/cart")
    public String cart(Model model, HttpSession session) {
        List<AddToCartForm> cartList = (List<AddToCartForm>) session.getAttribute("cart");
        if (cartList != null) {
            model.addAttribute("cartItemInfo", cartService.getCartFromSession(cartList));
            model.addAttribute("cartList", cartList);
            model.addAttribute("cartForm", new CartQuantityForm());
            model.addAttribute("total", cartService.getTotalCost(cartList));
        }
        return "cart";
    }

    @PostMapping("/cart/update-quantity")
    public String updateCartQuantity(CartQuantityForm cartForm, HttpSession session) {
        List<AddToCartForm> cartList = (List<AddToCartForm>) session.getAttribute("cart");
        cartList = cartService.updateQuantity(cartList, cartForm);
        session.setAttribute("cart", cartList);
        if (cartList.size() == 0) {
            session.removeAttribute("cartSize");
        } else {
            session.setAttribute("cartSize", cartList.size());
        }
        return "redirect:/cart";
    }

    @PostMapping("/move-to-checkout")
    public String moveToCheckout(HttpSession session, Model model) {
        if (session.getAttribute("email") != null) {
            return "redirect:/checkout";
        }
        return "redirect:/login";
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

        return "redirect:/product";
    }

    @GetMapping("/order")
    public String order(Model model, HttpSession httpSession) {
        if (httpSession.getAttribute("email") == null) {
            return "redirect:/login";
        }
        model.addAttribute("cart", cartService.getOrderFromCustomerID((String) httpSession.getAttribute("id")));
        model.addAttribute("cartList", cartService.getCartListFromCustomerID((String) httpSession.getAttribute("id")));

        return "order";
    }
}
