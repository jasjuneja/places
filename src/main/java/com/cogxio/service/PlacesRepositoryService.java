package com.cogxio.service;

import com.cogxio.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cogxio.repository.PlacesRepository;

import java.util.List;

/**
 * Created by jaspreet on 11/12/15.
 */
@Service
public class PlacesRepositoryService {

    @Autowired
    PlacesRepository placesRepository;

    public List<Place> findAllPlaces() {

            return placesRepository.findAll();

    }


    public long countPlaces() {

        return placesRepository.count();

    }

    public List<Place> findAllByNameAndCategory(String name, String category) {

        return placesRepository.findAllByNameAndCategory(name,category);
    }
}
