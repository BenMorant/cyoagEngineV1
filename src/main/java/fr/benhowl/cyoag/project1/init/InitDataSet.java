//package fr.benhowl.cyoag.project1.init;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Component;
//
//import fr.benhowl.cyoag.project1.business.CredentialsService;
//import fr.benhowl.cyoag.project1.business.UserService;
//import fr.benhowl.cyoag.project1.business.WeatherService;
//import fr.benhowl.cyoag.project1.entity.Weather;
//
//@Profile("initData")
//@Component
//public class InitDataSet {
//
//	@Autowired
//	UserService userService;
//
//	@Autowired
//	CredentialsService credentialsService;
//
//	@Autowired
//	WeatherService weatherService;
//
//	@PostConstruct
//	public void initData() {
//		Weather rain = weatherService.saveInBase(new Weather("rain"));
//
//
//	}
//}
//
