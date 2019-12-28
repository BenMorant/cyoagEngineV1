package fr.benhowl.cyoag.project1.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.benhowl.cyoag.project1.dao.ObjectDao;
import fr.benhowl.cyoag.project1.entity.Object;
	
	@Service
	@Transactional
	public class ObjectServiceImpl implements ObjectService {

		@Autowired
		ObjectDao objectDao;
			
		@Override
		public Object saveInBase(Object object) {
			return objectDao.save(object);
		}

}
