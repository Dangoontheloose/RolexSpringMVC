package com.rolex.web.repository;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import com.rolex.web.model.Customer;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

@Repository
@Transactional
public class CustomerRepository {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Customer> customerCollection;

    @Autowired
    public CustomerRepository() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

//        ConnectionString connString = new ConnectionString(
//                "mongodb://localhost:27017"
//        );
        ConnectionString connString = new ConnectionString(
                "mongodb+srv://dango:1234@rolexcluster.javs2.mongodb.net/Rolex?retryWrites=true&w=majority"
        );
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connString)
                .retryWrites(true)
                .build();
        mongoClient = MongoClients.create(settings);


        database = mongoClient.getDatabase("Rolex");
        database = database.withCodecRegistry(pojoCodecRegistry);
        customerCollection = database.getCollection("Customer", Customer.class);
    }

    public List<Customer> getCustomerList() {
        customerCollection = database.getCollection("Customer", Customer.class);

        List<Customer> customerList = new ArrayList<>();
        FindIterable<Customer> iterCustomer = customerCollection.find();
        for (Customer customer
                : iterCustomer) {
            customerList.add(customer);
        }
        return customerList;
    }
    public Customer getFirstCustomer() {
        customerCollection = database.getCollection("Customer", Customer.class);
        return customerCollection.find().first();
    }

    public void addCustomer(Customer customer) {
        customerCollection.insertOne(customer);
    }

}
