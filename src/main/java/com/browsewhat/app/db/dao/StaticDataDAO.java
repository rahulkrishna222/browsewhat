/**
 * 
 */
package com.browsewhat.app.db.dao;

import java.util.List;

import com.browsewhat.app.db.entities.Country;
import com.browsewhat.app.db.entities.District;
import com.browsewhat.app.db.entities.State;

/**
 * @author krahul
 *
 */
public interface StaticDataDAO {

    public List<Country> getCountries();

    public List<Country> getCountries(String nameStartsWith);

    public Country getCountry(Integer countryId);

    public Country getCountry(String name);

    public List<State> getStates(Integer countryId);

    public List<State> getStates(Integer countryId, String nameStartsWith);

    public State getState(Integer countryId);

    public State getState(Integer countryId, String name);

    public List<District> getDistricts(Integer stateId);

    public List<District> getDistricts(Integer stateId, String name);

    public District getDistrict(Integer stateId, String name);

}
