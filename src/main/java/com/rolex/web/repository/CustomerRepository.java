package com.rolex.web.repository;



import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import com.rolex.web.model.*;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.beans.factory.annotation.Autowired;



@Transactional
public class CustomerRepository {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Customer> customerCollection;
    private MongoCollection<Collection> collectionCollection;
    private MongoCollection<Product> productCollection;
    private MongoCollection<AccountType> accountTypeCollection;
    private MongoCollection<WatchSize> watchSizeCollection;
    private MongoCollection<WatchType> watchTypeCollection;

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
    public List<Collection> getCollectionList() {
      collectionCollection = database.getCollection("Collection", Collection.class);

        List<Collection> collectionList = new ArrayList<>();
        FindIterable<Collection> iterCollection = collectionCollection.find();
        for (Collection collection
                : iterCollection) {
            collectionList.add(collection);
        }
        return collectionList;
    }


    public List<WatchSize> getWatchSizeList() {
        watchSizeCollection = database.getCollection("WatchSize", WatchSize.class);

        List<WatchSize> watchSizeList = new ArrayList<>();
        FindIterable<WatchSize> iterWatchSize = watchSizeCollection.find();
        for (WatchSize watchSize
                : iterWatchSize) {
            watchSizeList.add(watchSize);
        }
        return watchSizeList;
    }
    public List<WatchType>getWatchTypeList() {
       watchTypeCollection = database.getCollection("WatchType", WatchType.class);

        List<WatchType> watchTypeList = new ArrayList<>();
        FindIterable<WatchType> iterWatchType = watchTypeCollection.find();
        for (WatchType watchType
                : iterWatchType) {
            watchTypeList.add(watchType);
        }
        return watchTypeList;
    }




    public Customer getFirstCustomer() {
        customerCollection = database.getCollection("Customer", Customer.class);
        return customerCollection.find().first();
    }

    public void addCustomer(Customer customer) {
        customerCollection.insertOne(customer);
    }


}
