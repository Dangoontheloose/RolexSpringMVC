package com.rolex.web.viewmodel;

import com.rolex.web.validation.constraint.collection.ConflictConstraint;

public class CollectionForm {
    @ConflictConstraint
    private String collID;
    public String getCollID() {
        return collID;
    }

    public void setCollID(String collID) {
        this.collID = collID;
    }

}
