/**
 * 
 */
package com.browsewhat.app.db.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.browsewhat.app.db.dao.StaticDataDAO;
import com.browsewhat.app.db.entities.Country;
import com.browsewhat.app.db.entities.District;
import com.browsewhat.app.db.entities.State;
import com.browsewhat.app.utils.BWLogger;

/**
 * @author krahul
 *
 */
public class StaticDataDAOImpl implements StaticDataDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Country> getCountries() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Country> getCountries(String nameStartsWith) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Country getCountry(Integer countryId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Country getCountry(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<State> getStates(Integer countryId) {
        Session session = sessionFactory.openSession();
        try {
            return session.createQuery("from State s where s.country.id = "+ countryId).list();
        } catch (Exception e) {
            BWLogger.error("Exception while getting states", e);
        } finally {
            session.close();
        }
        return null;
    }

    @Override
    public List<State> getStates(Integer countryId, String nameStartsWith) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public State getState(Integer countryId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public State getState(Integer countryId, String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<District> getDistricts(Integer stateId) {
        Session session = sessionFactory.openSession();
        try {
            return session.createQuery("from District dis where dis.state.id = "+ stateId).list();
        } catch (Exception e) {
            BWLogger.error("Exception while getting states", e);
        } finally {
            session.close();
        }
        return null;
    }

    @Override
    public List<District> getDistricts(Integer stateId, String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public District getDistrict(Integer stateId, String name) {
        // TODO Auto-generated method stub
        return null;
    }

}
