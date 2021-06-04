package com.rolex.web.repository;

import com.rolex.web.model.WatchSize;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface WatchSizeRepository extends MongoRepository<WatchSize, String> {
    List<WatchSize> findAllOrderBySizeValue();
    WatchSize findBySizeID(int sizeID);
    WatchSize findBySizeValue(int sizeValue);
    void deleteBySizeID(int sizeID);
}
