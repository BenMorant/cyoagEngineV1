package fr.benhowl.cyoag.project1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.benhowl.cyoag.project1.business.CredentialsService;
import fr.benhowl.cyoag.project1.business.UserService;
import fr.benhowl.cyoag.project1.dao.CredentialsDao;
import fr.benhowl.cyoag.project1.entity.Credentials;
import fr.benhowl.cyoag.project1.entity.User;

@SpringBootTest
class UserServiceTest {
	
	@Autowired
	private CredentialsService credentialsService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	CredentialsDao credentialsDao;
	
	@Test
	public void testCrudUser() {
		Credentials credentials = new Credentials(null, "loginTest", "hashedPasswordTest", "saltTest");
		credentialsService.saveInBase(credentials);
		User user = new User(null, "lastNameTest", "firstNameTest", "profilePictureTest", "emailTest", credentials);
		userService.saveInBase(user);
		Assertions.assertTrue(credentials.getId() > 0);
		Assertions.assertTrue(user.getId() > 0);
	}
	
	//Integer id, String login, String hashedPassword, String salt
	
	@Test
	public void testFindCredentials() {
		Credentials credentials = credentialsDao.findByLogin("user1");
		Assertions.assertTrue(credentials.getClass() != null);
	}

}
