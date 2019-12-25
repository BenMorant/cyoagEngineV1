package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Weapon;

public interface WeaponDao extends CrudRepository<Weapon, Integer> {
	
}