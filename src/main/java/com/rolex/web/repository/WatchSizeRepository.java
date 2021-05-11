package com.rolex.web.repository;

import com.rolex.web.model.WatchSize;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface WatchSizeRepository extends MongoRepository<WatchSize, String> {
}
