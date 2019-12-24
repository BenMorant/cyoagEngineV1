package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Credentials;

public interface CredentialsDao extends CrudRepository<Credentials, Integer> {
	
	Credentials findByLogin(String login);

}

