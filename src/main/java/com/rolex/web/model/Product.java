package com.rolex.web.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
    private String productID;
    private int price;
    private String description;
    private int stock;
    private String img;

    private int collectionID;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCollectionID() {
        return collectionID;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setCollectionID(int collectionID) {
        this.collectionID = collectionID;
    }
}
