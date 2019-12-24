package fr.benhowl.cyoag.project1.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Launcher extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Launcher.class);
//		app.setAdditionalProfiles("initData");
		ConfigurableApplicationContext context = app.run(args);
		System.out.println("http://localhost:8080/launcher");

	}

}
