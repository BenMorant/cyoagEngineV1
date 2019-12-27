package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Player;

public interface PlayerDao extends CrudRepository<Player, Integer> {
	
}