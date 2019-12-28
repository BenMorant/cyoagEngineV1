package fr.benhowl.cyoag.project1.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.benhowl.cyoag.project1.dao.WeaponDao;
import fr.benhowl.cyoag.project1.entity.Weapon;
	
	@Service
	@Transactional
	public class WeaponServiceImpl implements WeaponService {

		@Autowired
		WeaponDao weaponDao;
			
		@Override
		public Weapon saveInBase(Weapon weapon) {
			return weaponDao.save(weapon);
		}

}
