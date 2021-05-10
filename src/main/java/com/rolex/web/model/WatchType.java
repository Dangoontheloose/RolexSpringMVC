package com.rolex.web.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "WatchType")
public class WatchType {
    private int watchTypeID;
    private String watchTypeValue;

    public int getWatchTypeID() {
        return watchTypeID;
    }

    public void setWatchTypeID(int watchTypeID) {
        this.watchTypeID = watchTypeID;
    }

    public String getWatchTypeValue() {
        return watchTypeValue;
    }

    public void setWatchTypeValue(String watchTypeValue) {
        this.watchTypeValue = watchTypeValue;
    }
}

