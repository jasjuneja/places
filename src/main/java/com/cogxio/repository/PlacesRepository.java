package com.cogxio.repository;

import com.cogxio.model.Place;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by jaspreet on 11/12/15.
 */
public interface PlacesRepository extends MongoRepository<Place, String> {

     List<Place> findAllByNameAndCategory(String name,String category);

}
