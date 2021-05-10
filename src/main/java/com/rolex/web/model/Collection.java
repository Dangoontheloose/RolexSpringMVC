package com.rolex.web.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Collection")
public class Collection {
    private int collectionID;
    private String collectionName;

    public int getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(int collectionID) {
        this.collectionID = collectionID;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }
}
