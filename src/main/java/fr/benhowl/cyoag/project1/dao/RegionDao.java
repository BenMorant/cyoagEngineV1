package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Region;

public interface RegionDao extends CrudRepository<Region, Integer> {
	
}