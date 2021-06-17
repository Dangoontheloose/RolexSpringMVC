package com.rolex.web.viewmodel;

public class AdminProductVM {
    private String productName;
    private String productID;
    private String collectionName;
    private String description;
    private int price;
    private int stock;
    private int sizeValue;
    private String materialName;
    private String watchTypeValue;
    private String img;
    private String[] imgDetails;
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

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String[] getImgDetails() {
        return imgDetails;
    }

    public void setImgDetails(String[] imgDetails) {
        this.imgDetails = imgDetails;
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
