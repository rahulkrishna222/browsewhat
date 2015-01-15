/**
 * 
 */
package com.browsewhat.app.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.browsewhat.app.db.service.StaticDataService;
import com.browsewhat.app.utils.BWLogger;
import com.browsewhat.app.utils.StaticDataUtils;

/**
 * @author krahul
 *
 */
@Controller
@RequestMapping("static")
public class StaticDataController {

    @Autowired
    private StaticDataService staticDataService;

    @RequestMapping(value = "/countries", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public @ResponseBody List<Map<String, Object>> getCountries() {
        BWLogger.trace("Request reached for countries");
        // Check countries are already loaded to cache
        return StaticDataUtils.getCountries(staticDataService.getCountries());
    }

    @RequestMapping(value = "/country/{countryId}/states", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public @ResponseBody List<Map<String, Object>> getStates(@PathVariable("countryId") Integer countryId) {
        BWLogger.trace("Request reached for states");
        // Check countries are already loaded to cache
        return StaticDataUtils.getStates(staticDataService.getStates(countryId));
    }

    @RequestMapping(value = "/state/{stateId}/districts", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public @ResponseBody List<Map<String, Object>> getDistricts(@PathVariable("stateId") Integer stateId) {
        BWLogger.trace("Request reached for states");
        // Check countries are already loaded to cache
        return StaticDataUtils.getDistricts(staticDataService.getDistricts(stateId));
    }
}
