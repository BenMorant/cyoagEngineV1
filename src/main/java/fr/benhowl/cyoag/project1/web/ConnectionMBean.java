package fr.benhowl.cyoag.project1.web;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import fr.benhowl.cyoag.project1.business.AuthenticationManager;
import fr.benhowl.cyoag.project1.business.CredentialsService;
import fr.benhowl.cyoag.project1.business.UserService;
import fr.benhowl.cyoag.project1.entity.Credentials;
import fr.benhowl.cyoag.project1.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@ManagedBean
@SessionScoped
@Getter @Setter @NoArgsConstructor
public class ConnectionMBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String login;
	
	@Size(min=6)
	private String clearPassword;
	
	private String message;
	
	private User user = new User();
	
	@Inject
	private CredentialsService credentialsService;

	@Inject
	private UserService userService;

	
	@PostConstruct
	public void init() {
	}

	public String Connect() {
		Credentials credentials = credentialsService.findWithLogin(this.login);
		if(credentials != null) {
			Credentials cred = credentials;
			try {
				if(AuthenticationManager.authenticate(clearPassword, cred)) {
					user = userService.findWithCredentials(credentials);
							
							//.get(0); 
					//TODO : I don't know why it shows me an error
				} else {
					message = "indentifiants incorrects";
					return "userHome.xhtml?faces-redirect=true";
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			message = "indentifiants incorrects";
			return "login.xhtml";
		}
		return "user.xhtml?faces-redirect=true";
	}

	public String doCreateAccount() {
		
		Credentials credentials = new Credentials(login);
		try {
			AuthenticationManager.initializeCredentials(clearPassword , credentials);
		} catch (Exception e) {
			e.printStackTrace();
		}
		credentials =credentialsService.saveInBase(credentials);
		user.setCredentials(credentials);
		user=userService.saveInBase(user);
		message = "Votre compte client a bien été enregistré";
		return "userHome.xhtml?faces-redirect=true";
	}
	
}
