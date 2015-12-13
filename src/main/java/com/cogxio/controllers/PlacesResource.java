package com.cogxio.controllers;

import com.cogxio.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cogxio.service.PlacesRepositoryService;

import java.util.List;

/**
 * Created by jaspreet on 11/12/15.
 */

@RestController
@RequestMapping("/api/places")
public class  PlacesResource {

    @Autowired
    PlacesRepositoryService placesRepositoryService;


    @RequestMapping(method = RequestMethod.GET, value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Place> getPlaces()throws Exception {

        return placesRepositoryService.findAllPlaces();

    }

    @RequestMapping(method = RequestMethod.GET, value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public long getCount()throws Exception {

        return placesRepositoryService.countPlaces();

    }

    @RequestMapping(method = RequestMethod.GET, value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Place> searchByNameAndCategory(@RequestParam(value = "name", required = true) String name,@RequestParam(value = "category", required = true) String category)throws Exception {

        return placesRepositoryService.findAllByNameAndCategory(name,category);

    }
}
