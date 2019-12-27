package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Administrator;

public interface AdministratorDao extends CrudRepository<Administrator, Integer> {
	
}