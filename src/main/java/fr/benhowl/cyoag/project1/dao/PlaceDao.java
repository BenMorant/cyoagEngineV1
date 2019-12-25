package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Place;

public interface PlaceDao extends CrudRepository<Place, Integer> {
	
}