package com.rolex.web.viewmodel;

import java.util.List;

public class CartQuantityForm {
    private List<AddToCartForm> cartList;

    public List<AddToCartForm> getCartList() {
        return cartList;
    }

    public void setCartList(List<AddToCartForm> cartList) {
        this.cartList = cartList;
    }
}
