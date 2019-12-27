package fr.benhowl.cyoag.project1.business;

import fr.benhowl.cyoag.project1.entity.Credentials;
import fr.benhowl.cyoag.project1.entity.User;

public interface UserService {

	User saveInBase(User user);
	User searchById(Integer id);
	User findWithCredentials(Credentials credentials);
}
