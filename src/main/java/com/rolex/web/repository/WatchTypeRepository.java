package com.rolex.web.repository;

import com.rolex.web.model.WatchType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WatchTypeRepository extends MongoRepository<WatchType, String> {
}
