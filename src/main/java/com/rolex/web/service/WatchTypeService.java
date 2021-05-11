package com.rolex.web.service;


import com.rolex.web.model.Collection;
import com.rolex.web.model.WatchType;
import com.rolex.web.repository.WatchTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchTypeService {
    @Autowired
    WatchTypeRepository watchTypeRepository;

    public List<WatchType> getWatchTypeList() { return watchTypeRepository.findAll(); }

    public void addWatchType(WatchType watchType) { watchTypeRepository.insert(watchType);}
    public void deleteWatchType(WatchType watchType) { watchTypeRepository.delete(watchType);}
    public void updateWatchType(WatchType watchType) { watchTypeRepository.save(watchType);}
}
