package com.browsewhat.app.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.browsewhat.app.db.entities.BwModules;
import com.browsewhat.app.db.service.BrowseWhatServicesService;

@Controller
public class BwServicesController {

    @Autowired
    private BrowseWhatServicesService browseWhatServicesService;

    @RequestMapping(value = "services.html", method = RequestMethod.GET)
    @Cacheable(value = { "service_modules" })
    public String showServices(Model model) {

        List<BwModules> modules = browseWhatServicesService.getModules(true);

        model.addAttribute("Modules", getModuleMap(modules));

        return "services";
    }

    private List<Map<String, String>> getModuleMap(List<BwModules> modules) {
        List<Map<String, String>> modulesList = new ArrayList<Map<String, String>>(modules.size());
        for (BwModules module : modules) {
            if (!module.getModuleName().equalsIgnoreCase("Home")) {
                Map<String, String> moduleMap = new HashMap<String, String>(3);
                moduleMap.put("Name", module.getModuleName());
                moduleMap.put("Path", module.getUrl());
                moduleMap.put("Image", module.getImage());
                modulesList.add(moduleMap);
            }
        }
        return modulesList;
    }
}
