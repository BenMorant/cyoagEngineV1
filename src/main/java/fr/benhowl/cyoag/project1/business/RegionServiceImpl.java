package fr.benhowl.cyoag.project1.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import fr.benhowl.cyoag.project1.dao.RegionDao;
import fr.benhowl.cyoag.project1.entity.Region;

@Service
@Transactional
public class RegionServiceImpl implements RegionService {

	@Autowired
	RegionDao regionDao;
		
	@Override
	public Region saveInBase(Region region) {
		return regionDao.save(region);
	}

}
