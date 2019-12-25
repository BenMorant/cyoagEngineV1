package fr.benhowl.cyoag.project1.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Credentials;
import fr.benhowl.cyoag.project1.entity.Hero;
import fr.benhowl.cyoag.project1.entity.User;

public interface UserDao extends CrudRepository<User, Integer> {

	User findByCredentials(Credentials credentials);
	
}
