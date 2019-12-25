package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Boss;

public interface BossDao extends CrudRepository<Boss, Integer> {
	
}
