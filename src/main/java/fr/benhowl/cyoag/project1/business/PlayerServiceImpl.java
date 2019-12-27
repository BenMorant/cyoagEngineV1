package fr.benhowl.cyoag.project1.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import fr.benhowl.cyoag.project1.dao.PlayerDao;
import fr.benhowl.cyoag.project1.entity.Player;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	PlayerDao playerDao;
		
	@Override
	public Player saveInBase(Player player) {
		return playerDao.save(player);
	}

}
