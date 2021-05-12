package com.rolex.web.viewmodel;

public class ProductViewModel {
    private String productID;
    private String collectionName;
    private String description;
    private int price;
    private int stock;
    private int sizeValue;
    private String watchTypeValue;
    private String img;

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

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSizeValue() {
        return sizeValue;
    }

    public void setSizeValue(int sizeValue) {
        this.sizeValue = sizeValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWatchTypeValue() {
        return watchTypeValue;
    }

    public void setWatchTypeValue(String watchTypeValue) {
        this.watchTypeValue = watchTypeValue;
    }
}
