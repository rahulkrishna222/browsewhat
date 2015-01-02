package com.browsewhat.app.db.dao;

import java.util.List;

import com.browsewhat.app.db.entities.BwModules;

public interface BrowseWhatServicesDAO {

    public List<BwModules> getModules(boolean isPublic);
}
