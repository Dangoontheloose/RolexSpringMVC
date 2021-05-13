package com.rolex.web.viewmodel;

public class ProductDetailViewModel {
    private String productID;
    private int price;
    private String description;
    private int collectionID;
    private String img;
    private int watchTypeID;
    private int sizeID;

    public int getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(int collectionID) {
        this.collectionID = collectionID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
