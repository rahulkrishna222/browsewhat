package com.browsewhat.app.db.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.browsewhat.app.db.dao.BrowseWhatServicesDAO;
import com.browsewhat.app.db.entities.BwModules;
import com.browsewhat.app.db.service.BrowseWhatServicesService;

public class BrowseWhatServicesServiceImpl implements BrowseWhatServicesService {
    
    @Autowired
    private BrowseWhatServicesDAO browseWhatServicesDAO;

    @Override
    public List<BwModules> getModules(boolean isPublic) {
        // TODO Auto-generated method stub
        return browseWhatServicesDAO.getModules(isPublic);
    }

}
