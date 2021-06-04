package com.rolex.web.repository;

import com.rolex.web.model.CartDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CartDetailRepository extends MongoRepository<CartDetail, String> {
    List<CartDetail> findAllByCartID(String cartID);
}
