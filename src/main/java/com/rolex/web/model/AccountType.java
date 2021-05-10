package com.rolex.web.model;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "AccountType")
public class AccountType {
    private int AccountTypeID;
    private String AccountType;

    private List<Customer> customers;

    public int getAccountTypeID() {
        return AccountTypeID;
    }

    public void setAccountTypeID(int accountTypeID) {
        AccountTypeID = accountTypeID;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
