package fr.benhowl.cyoag.project1.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.benhowl.cyoag.project1.dao.CredentialsDao;
import fr.benhowl.cyoag.project1.entity.Credentials;

@Service
@Transactional
public class CredentialsServiceImpl implements CredentialsService {

	@Autowired
	private CredentialsDao dao;
	
	@Override
	public Credentials searchById(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public Credentials saveInBase(Credentials credentials) {
		return dao.save(credentials);
	}

	@Override
	public Credentials findWithLogin(String login) {
		return dao.findByLogin(login);
	}

}
