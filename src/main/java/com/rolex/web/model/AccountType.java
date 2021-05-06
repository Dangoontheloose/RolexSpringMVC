package com.rolex.web.model;


import java.util.List;


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
