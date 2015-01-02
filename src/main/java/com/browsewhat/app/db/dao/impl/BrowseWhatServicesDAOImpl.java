package com.browsewhat.app.db.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.browsewhat.app.db.dao.BrowseWhatServicesDAO;
import com.browsewhat.app.db.entities.BwModules;
import com.browsewhat.app.utils.BWLogger;

public class BrowseWhatServicesDAOImpl implements BrowseWhatServicesDAO {

    @Autowired
    private SessionFactory SessionFactory;

    @SuppressWarnings("unchecked")
    @Override
    public List<BwModules> getModules(boolean isPublic) {
        Session session = SessionFactory.openSession();
        try {
            Query query = session.createQuery("from BwModules");

            List<BwModules> modules = query.list();

            return modules;
        } catch (Exception e) {
            e.printStackTrace();
            BWLogger.error("Exception while fetching Module", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return new ArrayList<BwModules>(0);
    }

}
