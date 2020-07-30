package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Item;

public interface ItemDao extends CrudRepository<Item, Integer> {
	
}