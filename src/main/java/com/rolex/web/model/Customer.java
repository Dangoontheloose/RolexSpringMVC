package com.rolex.web.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
    private String customerID;
    private String address;
    private String email;
    private String password;
    private String phoneNum;
    private String name;
    private int accountTypeID;

//    @ManyToOne
//    private AccountType accountType;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
