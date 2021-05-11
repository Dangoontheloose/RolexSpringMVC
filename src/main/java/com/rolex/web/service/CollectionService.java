package com.rolex.web.service;

import com.rolex.web.model.Collection;
import com.rolex.web.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {
    @Autowired
    CollectionRepository collectionRepository;

    public List<Collection> getCollectionList() { return collectionRepository.findAll(); }

    public void addCollection(Collection collection) { collectionRepository.insert(collection);}
    public void deleteCollection(Collection collection) { collectionRepository.delete(collection);}
    public void updateCollection(Collection collection) { collectionRepository.save(collection);}
}
