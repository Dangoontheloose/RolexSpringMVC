package com.rolex.web.service;

import com.rolex.web.model.Cart;
import com.rolex.web.repository.CartRepository;
import com.rolex.web.viewmodel.AddToCartForm;
import com.rolex.web.viewmodel.CartQuantityForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

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
}
