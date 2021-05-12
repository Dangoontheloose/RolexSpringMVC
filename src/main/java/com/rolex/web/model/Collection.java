package com.rolex.web.model;

import com.rolex.web.validation.constraint.collection.ConflictConstraint;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Collection")
public class Collection {
    @Id
    private String _id;
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
