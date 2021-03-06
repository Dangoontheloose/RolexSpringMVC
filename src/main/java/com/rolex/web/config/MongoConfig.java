package com.rolex.web.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = "com.rolex.web.repository")
public class MongoConfig  {
    @Bean
    public MongoClient mongo() {
//        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/Rolex");
        ConnectionString connectionString = new ConnectionString("mongodb+srv://user1:1111@rolexcluster.javs2.mongodb.net/Rolex?retryWrites=true&w=majority");
//        ConnectionString connectionString = new ConnectionString("mongodb+srv://dango:1234@rolexcluster.javs2.mongodb.net/Rolex?retryWrites=true&w=majority");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "Rolex");
    }

}