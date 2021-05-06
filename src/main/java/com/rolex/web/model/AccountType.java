package com.rolex.web.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class AccountType {
    public int AccountTypeID;
    public String AccountType;

    @OneToMany(mappedBy="accountType")
    private List<Customer> customers;
}
