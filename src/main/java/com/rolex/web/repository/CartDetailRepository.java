package com.rolex.web.repository;

import com.rolex.web.model.CartDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartDetailRepository extends MongoRepository<CartDetail, String> {
}
