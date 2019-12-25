package fr.benhowl.cyoag.project1.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.benhowl.cyoag.project1.dao.WeatherDao;
import fr.benhowl.cyoag.project1.entity.Weather;
	
	@Service
	@Transactional
	public class WeatherServiceImpl implements WeatherService {

		@Autowired
		WeatherDao weatherDao;
			
		@Override
		public Weather saveInBase(Weather weather) {
			return weatherDao.save(weather);
		}

}
