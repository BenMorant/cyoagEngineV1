package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Inventory;

public interface InventoryDao extends CrudRepository<Inventory, Integer> {
	

}

