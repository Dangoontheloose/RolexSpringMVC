package com.rolex.web.service;

import com.rolex.web.model.WatchSize;
import com.rolex.web.model.WatchType;
import com.rolex.web.repository.WatchSizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.WatchService;
import java.util.List;

@Service
public class WatchSizeService {
    @Autowired
    WatchSizeRepository watchSizeRepository;

    public List<WatchSize> getSizeList() { return watchSizeRepository.findAll(); }

    public void deleteWatchSize(WatchSize watchSize) { watchSizeRepository.delete(watchSize);}
    public void deleteWatchSizeBySizeID(int sizeID) { watchSizeRepository.deleteBySizeID(sizeID);}
    public void updateWatchSize(WatchSize watchSize) {
        WatchSize currentWatch = watchSizeRepository.findBySizeID(watchSize.getSizeID());
        if (currentWatch != null) {
            currentWatch.setSizeValue(watchSize.getSizeValue());
            watchSizeRepository.save(currentWatch);
        }
        else{
            watchSizeRepository.insert(watchSize);
        }
    }
}
