package com.rolex.web.service;

import com.rolex.web.model.Cart;
import com.rolex.web.repository.CartRepository;
import com.rolex.web.viewmodel.AddToCartForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
