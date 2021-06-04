package com.rolex.web.repository;

import com.rolex.web.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByCollectionID(int collectionID);

    Product findFirstByProductID(String productID);
    Product findFirstByCollectionID(int collectionID);
}