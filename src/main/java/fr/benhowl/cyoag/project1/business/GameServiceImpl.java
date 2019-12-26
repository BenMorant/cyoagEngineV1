package fr.benhowl.cyoag.project1.business;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.benhowl.cyoag.project1.dao.GameDao;
import fr.benhowl.cyoag.project1.entity.Game;


@Service
@Transactional
public class GameServiceImpl implements GameService {

	@Autowired
	GameDao gameDao;
		
	@Override
	public Game saveInBase(Game game) {
		return gameDao.save(game);
	}

}
