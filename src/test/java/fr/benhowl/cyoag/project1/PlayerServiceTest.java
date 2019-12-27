package fr.benhowl.cyoag.project1;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.benhowl.cyoag.project1.business.CredentialsService;
import fr.benhowl.cyoag.project1.business.GameService;
import fr.benhowl.cyoag.project1.business.PlayerService;
import fr.benhowl.cyoag.project1.dao.CredentialsDao;
import fr.benhowl.cyoag.project1.entity.Credentials;
import fr.benhowl.cyoag.project1.entity.Game;
import fr.benhowl.cyoag.project1.entity.Player;

@SpringBootTest
class PlayerServiceTest {

	@Autowired
	private CredentialsService credentialsService;

	@Autowired
	private PlayerService playerService;

	@Autowired
	private GameService gameService;

	@Autowired
	private CredentialsDao credentialsDao;

	@Test
	public void testCrudPlayer() {

		Game game1 = new Game(null, "partie1");
		Game game2 = new Game(null, "partie2");
		gameService.saveInBase(game1);
		gameService.saveInBase(game2);
		List<Game> games = new ArrayList<Game>();
		games.add(game1);
		games.add(game2);
		Credentials credentials = new Credentials(null, "loginTest", "hashedPasswordTest", "saltTest");
		credentialsService.saveInBase(credentials);
		Player playerTest = new Player(null, "lastNameTest", "firstNameTest", "nickNameTest", "profilePictureTest", "emailTest", credentials, games);
		playerService.saveInBase(playerTest);
		Assertions.assertTrue(credentials.getId() > 0);
		Assertions.assertTrue(playerTest.getId() > 0);
	}

	@Test
	public void testFindCredentials() {
		Credentials credentials = credentialsDao.findByLogin("loginTest");
		Assertions.assertTrue(credentials.getClass() != null);
	}

}
