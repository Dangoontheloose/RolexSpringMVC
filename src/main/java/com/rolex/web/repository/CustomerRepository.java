package com.rolex.web.repository;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;

import com.mongodb.client.model.Filters;
import com.mongodb.internal.client.model.FindOptions;
import com.rolex.web.model.AccountType;
import com.rolex.web.model.Collection;
import com.rolex.web.model.Customer;

import com.rolex.web.model.Product;
import com.rolex.web.viewmodel.CustomerViewModel;
import com.rolex.web.viewmodel.ProductViewModel;
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
    private MongoCollection<AccountType> accountTypeCollection;
    private MongoCollection<Product> productCollection;
    private MongoCollection<Collection> collectionCollection;


    @Autowired
    public CustomerRepository() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        ConnectionString connString = new ConnectionString(
                "mongodb://localhost:27017"
        );
//        ConnectionString connString = new ConnectionString(
//                "mongodb+srv://dango:1234@rolexcluster.javs2.mongodb.net/Rolex?retryWrites=true&w=majority"
//        );
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connString)
                .retryWrites(true)
                .build();
        mongoClient = MongoClients.create(settings);


        database = mongoClient.getDatabase("Rolex");
        database = database.withCodecRegistry(pojoCodecRegistry);
        customerCollection = database.getCollection("Customer", Customer.class);
    }
    // Example 1: Get a whole list of document
    // Ví dụ 1: Lấy 1 list
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
    // Example 2: Get one document
    // Ví dụ 2: Lấy 1 document()
    public Customer getFirstCustomer() {
        customerCollection = database.getCollection("Customer", Customer.class);
        return customerCollection.find().first();
    }
    // Example 3: Get & insert data into View Model (from 1 collection)
    // Ví dụ 3: Lấy & nạp dữ liệu vào View Model
    public CustomerViewModel getCustomerDetails() {
        customerCollection = database.getCollection("Customer", Customer.class);
        Customer customer = customerCollection.find().first();
        CustomerViewModel cvm = new CustomerViewModel();
        if (customer != null) {
            cvm.setEmail(customer.getEmail());
            cvm.setName(customer.getName());
        }
        return cvm;
    }
    // Example 4: Get & insert data into View Model (from multiple related collection)
    // Ví dụ 4: Lấy & nạp dữ liệu vào View Model (lấy từ nhiều collection)
    public ProductViewModel getFirstProduct() {
        collectionCollection = database.getCollection("Collection", Collection.class);
        productCollection = database.getCollection("Product", Product.class);
        Product product = productCollection.find().first();
        Collection collection = collectionCollection.find(Filters.eq("collectionID", product.getCollectionID())).first();

        ProductViewModel pvm = new ProductViewModel();

        pvm.setImg(product.getImg());
        pvm.setProductID(product.getProductID());
        pvm.setPrice(product.getPrice());
        pvm.setCollectionName(collection.getCollectionName());

        return pvm;
    }
}
