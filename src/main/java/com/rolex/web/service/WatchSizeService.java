package com.rolex.web.service;

import com.rolex.web.model.WatchSize;
import com.rolex.web.repository.WatchSizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchSizeService {
    @Autowired
    WatchSizeRepository watchSizeRepository;

    public List<WatchSize> getSizeList() { return watchSizeRepository.findAll(); }

    public void addWatchSize(WatchSize watchSize) { watchSizeRepository.insert(watchSize);}
    public void deleteWatchSize(WatchSize watchSize) { watchSizeRepository.delete(watchSize);}
    public void updateWatchSize(WatchSize watchSize) { watchSizeRepository.save(watchSize);}
}
