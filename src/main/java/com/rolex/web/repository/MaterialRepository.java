package com.rolex.web.repository;

import com.rolex.web.model.Material;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaterialRepository extends MongoRepository<Material, String> {
    Material findByMaterialName(String materialName);
    Material findByMaterialID(int materialID);
    void deleteByMaterialID(int materialID);
}
