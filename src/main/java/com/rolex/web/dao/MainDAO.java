package com.rolex.web.dao;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.rolex.web.model.Customer;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

//@Service("userService")
@Transactional
public class MainDAO {
    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Customer> customers;

    public MainDAO() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        mongoClient = MongoClients.create("mongodb+srv://dango:1234@rolexcluster.javs2.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        database = mongoClient.getDatabase("Rolex");
        database = database.withCodecRegistry(pojoCodecRegistry);
        customers = database.getCollection("Customer", Customer.class);
    }

    public List<Customer> getCustomerList() {
        customers = database.getCollection("Customer", Customer.class);
        List<Customer> customerList = new ArrayList<>();
        customers.find();
        return customerList;
    }

    public void addCustomer(Customer customer) {
        customers.insertOne(customer);
    }
}
