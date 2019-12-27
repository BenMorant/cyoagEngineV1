package fr.benhowl.cyoag.project1.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import fr.benhowl.cyoag.project1.dao.AdministratorDao;
import fr.benhowl.cyoag.project1.entity.Administrator;


@Service
@Transactional
public class AdministratorServiceImpl implements AdministratorService {

	@Autowired
	AdministratorDao administratorDao;
		
	@Override
	public Administrator saveInBase(Administrator administrator) {
		return administratorDao.save(administrator);
	}

}
