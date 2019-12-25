package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.People;

public interface PeopleDao extends CrudRepository<People, Integer> {
	
}