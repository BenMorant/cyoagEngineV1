package fr.benhowl.cyoag.project1.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.benhowl.cyoag.project1.dao.UserDao;
import fr.benhowl.cyoag.project1.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
		
	@Override
	public User saveInBase(User user) {
		return userDao.save(user);
	}

}
