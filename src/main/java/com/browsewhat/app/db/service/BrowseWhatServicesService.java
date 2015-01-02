package com.browsewhat.app.db.service;

import java.util.List;

import com.browsewhat.app.db.entities.BwModules;

public interface BrowseWhatServicesService {
    
    
    public List<BwModules> getModules(boolean isPublic);
}
