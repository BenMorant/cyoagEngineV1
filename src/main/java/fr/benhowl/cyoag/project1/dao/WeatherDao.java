package fr.benhowl.cyoag.project1.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benhowl.cyoag.project1.entity.Weather;

public interface WeatherDao extends CrudRepository<Weather, Integer> {
	
}