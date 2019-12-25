package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Landscape;

public interface LandscapeDao extends CrudRepository<Landscape, Integer> {
	
}