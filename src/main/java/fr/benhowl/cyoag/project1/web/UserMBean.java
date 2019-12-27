//package fr.benhowl.cyoag.project1.web;
//
//import javax.annotation.ManagedBean;
//import javax.annotation.PostConstruct;
//import javax.enterprise.context.SessionScoped;
//import javax.inject.Inject;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.Size;
//
//import fr.benhowl.cyoag.project1.business.AuthenticationManager;
//import fr.benhowl.cyoag.project1.business.CredentialsService;
//import fr.benhowl.cyoag.project1.business.UserService;
//import fr.benhowl.cyoag.project1.entity.Credentials;
//import fr.benhowl.cyoag.project1.entity.User;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import java.io.Serializable;
//
//@ManagedBean
//@SessionScoped
//@Getter @Setter 
//public class UserMBean implements Serializable {
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	private String login;
//	
//	@Size(min=6)
//	private String clearPassword;
//	
//	private String message;
//	
//	private User user;
//	
//	@Inject
//	private CredentialsService credentialsService;
//
//	@Inject
//	private UserService userService;
//
//	
//	@PostConstruct
//	public void init() {
//		
//		user = new User();
//	}
//
//	public String connect() {
//		Credentials credentials = credentialsService.findWithLogin(this.login);
//		if(credentials != null) {
//			try {
//				if(AuthenticationManager.authenticate(clearPassword, credentials)) {
//					user = userService.findWithCredentials(credentials);
//					return "userHome.xhtml?faces-redirect=true";		
//				} else {
//					message = "indentifiants incorrects";
//					return "userHome.xhtml?faces-redirect=true";
//				}
//
//			} catch (Exception e) {
//				e.printStackTrace();
//				message = e.getMessage();
//				return "login.xhtml";
//			}
//		} else {
//			message = "indentifiants incorrects";
//			return "login.xhtml";
//		}
//	}
//
//	public String createAccount() {
//		
//		Credentials credentials = new Credentials(login);
//		try {
//			AuthenticationManager.initializeCredentials(clearPassword , credentials);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		credentials =credentialsService.saveInBase(credentials);
//		user.setCredentials(credentials);
//		user=userService.saveInBase(user);
//		message = "Votre compte client a bien été enregistré";
//		return "userHome.xhtml?faces-redirect=true";
//	}
//	
//}
