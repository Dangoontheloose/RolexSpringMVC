package com.rolex.web.repository;

import com.rolex.web.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    @Query("{ 'collectionName': ?0}")
    Product findByCollectionName(String name);
}
