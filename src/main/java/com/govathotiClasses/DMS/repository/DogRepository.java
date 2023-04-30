package com.govathotiClasses.DMS.repository;


import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.govathotiClasses.DMS.Models.Dog;

/**
 * @author S555276
 * 
 */
public interface DogRepository extends CrudRepository<Dog,Integer> {
	List<Dog>findByName(String name);

}
