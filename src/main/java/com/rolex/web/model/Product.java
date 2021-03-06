package com.rolex.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Product")
public class Product {
    @Id
    private String _id;
    private String productID;
    private String productName;
    private int price;
    private String description;
    private int stock;
    private String img;
    private String[] imgDetails;
    private int materialID;
    private int sizeID;
    private int watchTypeID;
    private int collectionID;
    private String[] detailDescription;

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

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public int getWatchTypeID() {
        return watchTypeID;
    }

    public void setWatchTypeID(int watchTypeID) {
        this.watchTypeID = watchTypeID;
    }

    public String[] getImgDetails() {
        return imgDetails;
    }

    public void setImgDetails(String[] imgDetails) {
        this.imgDetails = imgDetails;
    }

    public int getMaterialID() {
        return materialID;
    }

    public void setMaterialID(int materialID) {
        this.materialID = materialID;
    }

    public String[] getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String[] detailDescription) {
        this.detailDescription = detailDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
