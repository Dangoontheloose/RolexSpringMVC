package com.rolex.web.service;

import com.rolex.web.model.Collection;
import com.rolex.web.model.WatchType;
import com.rolex.web.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {
    @Autowired
    CollectionRepository collectionRepository;

    public List<Collection> getCollectionList() { return collectionRepository.findAll(); }

    public void deleteCollectionByCollectionID(int id) {

        collectionRepository.deleteByCollectionID(id);
    }
    public void updateCollection(Collection collection) {
        Collection currentCollection = collectionRepository.findByCollectionID(collection.getCollectionID());
        if (currentCollection != null) {
            currentCollection.setCollectionName(collection.getCollectionName());
            collectionRepository.save(currentCollection);
        }
        else{
            collectionRepository.insert(collection);
        }}
}
