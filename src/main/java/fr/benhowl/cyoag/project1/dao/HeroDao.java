package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Hero;

public interface HeroDao extends CrudRepository<Hero, Integer> {
	
}
