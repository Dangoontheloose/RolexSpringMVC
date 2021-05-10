package com.rolex.web.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "WatchSize")
public class WatchSize {
    private int sizeID;
    private int sizeValue;

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public int getSizeValue() {
        return sizeValue;
    }

    public void setSizeValue(int sizeValue) {
        this.sizeValue = sizeValue;
    }

}
