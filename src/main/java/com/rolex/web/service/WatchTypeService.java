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

    public void updateWatchType(WatchType watchType) {
        WatchType currentWatch = watchTypeRepository.findByWatchTypeID(watchType.getWatchTypeID());
        if (currentWatch != null) {
            currentWatch.setWatchTypeValue(watchType.getWatchTypeValue());
            watchTypeRepository.save(currentWatch);
        }
        else{
            watchTypeRepository.insert(watchType);
        }
    }
    public void deleteWatchType(WatchType watchType) { watchTypeRepository.delete(watchType);}
    public void deleteWatchTypeByWatchTypeID(int id) { watchTypeRepository.deleteByWatchTypeID(id);}
}
