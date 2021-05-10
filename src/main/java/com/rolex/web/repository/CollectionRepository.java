package com.rolex.web.repository;

import com.rolex.web.model.Collection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CollectionRepository extends MongoRepository<Collection, String> {
}
