package com.browsewhat.app.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.browsewhat.app.db.entities.Country;
import com.browsewhat.app.db.entities.District;
import com.browsewhat.app.db.entities.State;

public class StaticDataUtils {

    public static List<Map<String, Object>> getCountries(List<Country> countries) {
        List<Map<String, Object>> countriesList = new ArrayList<Map<String, Object>>(countries.size());
        for (Country country : countries) {
            Map<String, Object> countryMap = new HashMap<String, Object>(2);
            countryMap.put("ID", country.getId());
            countryMap.put("Name", country.getName());
            countriesList.add(countryMap);
        }
        return countriesList;
    }

    public static List<Map<String, Object>> getStates(List<State> states) {
        List<Map<String, Object>> statesList = new ArrayList<Map<String, Object>>(states.size());
        for (State state : states) {
            Map<String, Object> stateMap = new HashMap<String, Object>(2);
            stateMap.put("ID", state.getId());
            stateMap.put("Name", state.getName());
            statesList.add(stateMap);
        }
        return statesList;
    }

    public static List<Map<String, Object>> getDistricts(List<District> districts) {
        List<Map<String, Object>> districtsList = new ArrayList<Map<String, Object>>(districts.size());
        for (District district : districts) {
            Map<String, Object> districtMap = new HashMap<String, Object>(2);
            districtMap.put("ID", district.getId());
            districtMap.put("Name", district.getName());
            districtsList.add(districtMap);
        }
        return districtsList;
    }
}
