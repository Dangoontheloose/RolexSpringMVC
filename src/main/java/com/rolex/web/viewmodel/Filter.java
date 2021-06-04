package com.rolex.web.viewmodel;

import com.rolex.web.model.Collection;
import com.rolex.web.model.Material;
import com.rolex.web.model.WatchSize;
import com.rolex.web.model.WatchType;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    private String[] collectionFilter;
    private String[] materialFilter;
    private String[] sizeFilter;
    private String[] typeFilter;


    public String[] getCollectionFilter() {
        return collectionFilter;
    }

    public void setCollectionFilter(String[] collectionFilter) {
        this.collectionFilter = collectionFilter;
    }

    public String[] getMaterialFilter() {
        return materialFilter;
    }

    public void setMaterialFilter(String[] materialFilter) {
        this.materialFilter = materialFilter;
    }

    public String[] getSizeFilter() {
        return sizeFilter;
    }

    public void setSizeFilter(String[] sizeFilter) {
        this.sizeFilter = sizeFilter;
    }

    public String[] getTypeFilter() {
        return typeFilter;
    }

    public void setTypeFilter(String[] typeFilter) {
        this.typeFilter = typeFilter;
    }
}
