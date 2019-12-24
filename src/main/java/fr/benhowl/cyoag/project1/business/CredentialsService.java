package fr.benhowl.cyoag.project1.business;

import java.util.List;

import fr.benhowl.cyoag.project1.entity.Credentials;

public interface CredentialsService {

	Credentials searchById(Integer id);
	Credentials saveInBase(Credentials credentials);
	Credentials findWithLogin(String login);
	
}
