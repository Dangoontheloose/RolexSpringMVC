package com.rolex.web.service;

import com.rolex.web.model.Cart;
import com.rolex.web.model.CartDetail;
import com.rolex.web.model.Product;
import com.rolex.web.repository.CartDetailRepository;
import com.rolex.web.repository.CartRepository;
import com.rolex.web.repository.ProductRepository;
import com.rolex.web.viewmodel.AddToCartForm;
import com.rolex.web.viewmodel.CartQuantityForm;
import com.rolex.web.viewmodel.CheckoutProductVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CartDetailRepository cartDetailRepository;


    public List<AddToCartForm> addToTempCart(List<AddToCartForm> cartList, AddToCartForm addToCartForm) {
        for (AddToCartForm form :
                cartList) {
            if (form.getpID().equals(addToCartForm.getpID())) {
                form.setQuantity(form.getQuantity() + addToCartForm.getQuantity());
                return cartList;
            }
        }
        cartList.add(addToCartForm);
        return cartList;
    }

    public List<AddToCartForm> updateQuantity(List<AddToCartForm> cartList, CartQuantityForm cartForm) {
        List<AddToCartForm> updatedCartList = new ArrayList<>();
        for (AddToCartForm cartItem :
                cartList) {
            for (AddToCartForm cartFormItem :
                    cartForm.getCartList()) {
                if (cartItem.getpID().equals(cartFormItem.getpID())) {
                    if (cartFormItem.getQuantity() != 0) {
                        cartItem.setQuantity(cartFormItem.getQuantity());
                        updatedCartList.add(cartItem);
                    }
                    break;
                }
            }
        }
        return updatedCartList;
    }

    public List<CheckoutProductVM> getCartFromSession(List<AddToCartForm> cartList) {
        List<CheckoutProductVM> checkoutProductVMList = new ArrayList<>();
        for (AddToCartForm cartItem :
                cartList) {
            Product product = productRepository.findFirstByProductID(cartItem.getpID());
            CheckoutProductVM cvm = new CheckoutProductVM() {{
                setProductID(product.getProductID());
                setPrice(product.getPrice());
                setProductName(product.getProductName());
                setQuantity(cartItem.getQuantity());
            }};

            checkoutProductVMList.add(cvm);
        }
        return checkoutProductVMList;
    }

    public int getTotalCost(List<AddToCartForm> cartList) {
        int total = 0;
        List<CheckoutProductVM> checkoutProductVMList = new ArrayList<>();
        for (AddToCartForm cartItem :
                cartList) {
            Product product = productRepository.findFirstByProductID(cartItem.getpID());
            total += product.getPrice() * cartItem.getQuantity();
        }

        return total;
    }

    public void createOrder(String customerID, List<AddToCartForm> cartList) {
        Cart cart = new Cart() {{
            setCustomerID(customerID);
            setState("Being delivered");
            setDeliveryDate(LocalDate.now());
        }};
        cartRepository.insert(cart);

        for (AddToCartForm cartItem :
                cartList) {
            CartDetail cartDetail = new CartDetail(){{
                setCartID(cart.getCartID());
                setProductID(cartItem.getpID());
                setQuantity(cartItem.getQuantity());
            }};
            cartDetailRepository.insert(cartDetail);
        }
    }
}
