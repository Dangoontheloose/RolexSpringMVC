package com.rolex.web.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CartDetail")
public class CartDetail {
    private String cartID;
    private String productID;
    private int quantity;

    public String getCartID() {
        return cartID;
    }

    public void setCartID(String cartID) {
        this.cartID = cartID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
