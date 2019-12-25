package fr.benhowl.cyoag.project1.init;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import fr.benhowl.cyoag.project1.business.WeatherService;
import fr.benhowl.cyoag.project1.entity.Weather;


@Profile("initData")
@Component
public class InitDataSet {


	@Autowired
	WeatherService weatherService;

	@PostConstruct
	public void initData() {
		Weather weatherTest = weatherService.saveInBase(new Weather("rain"));

	}
}
