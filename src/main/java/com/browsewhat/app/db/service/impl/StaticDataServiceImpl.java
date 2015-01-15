/**
 * 
 */
package com.browsewhat.app.db.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.browsewhat.app.db.dao.StaticDataDAO;
import com.browsewhat.app.db.entities.Country;
import com.browsewhat.app.db.entities.District;
import com.browsewhat.app.db.entities.State;
import com.browsewhat.app.db.service.StaticDataService;

/**
 * @author krahul
 *
 */
public class StaticDataServiceImpl implements StaticDataService {
    
    @Autowired
    private StaticDataDAO staticDataDao;

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.StaticDataService#getCountries()
     */
    @Override
    public List<Country> getCountries() {
        // TODO Auto-generated method stub
        return staticDataDao.getCountries();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.StaticDataService#getCountries(java.lang.String)
     */
    @Override
    public List<Country> getCountries(String nameStartsWith) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.StaticDataService#getCountry(java.lang.Integer)
     */
    @Override
    public Country getCountry(Integer countryId) {
        // TODO Auto-generated method stub
        return staticDataDao.getCountry(countryId);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.StaticDataService#getCountry(java.lang.String)
     */
    @Override
    public Country getCountry(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.StaticDataService#getStates(java.lang.Integer)
     */
    @Override
    public List<State> getStates(Integer countryId) {
        // TODO Auto-generated method stub
        return staticDataDao.getStates(countryId);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.StaticDataService#getStates(java.lang.Integer, java.lang.String)
     */
    @Override
    public List<State> getStates(Integer countryId, String nameStartsWith) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.StaticDataService#getState(java.lang.Integer)
     */
    @Override
    public State getState(Integer countryId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.StaticDataService#getState(java.lang.Integer, java.lang.String)
     */
    @Override
    public State getState(Integer countryId, String name) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.StaticDataService#getDistricts(java.lang.Integer)
     */
    @Override
    public List<District> getDistricts(Integer stateId) {
        // TODO Auto-generated method stub
        return staticDataDao.getDistricts(stateId);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.StaticDataService#getDistricts(java.lang.Integer, java.lang.String)
     */
    @Override
    public List<District> getDistricts(Integer stateId, String name) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.StaticDataService#getDistrict(java.lang.Integer, java.lang.String)
     */
    @Override
    public District getDistrict(Integer stateId, String name) {
        // TODO Auto-generated method stub
        return null;
    }

}
