package fr.benhowl.cyoag.project1.web;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Size;

import fr.benhowl.cyoag.project1.business.AuthenticationManager;
import fr.benhowl.cyoag.project1.business.CredentialsService;
import fr.benhowl.cyoag.project1.business.UserService;
import fr.benhowl.cyoag.project1.entity.Credentials;
import fr.benhowl.cyoag.project1.entity.User;
import fr.benhowl.cyoag.project1.entity.UserHelper;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;


@ManagedBean
@SessionScoped
@Getter @Setter
public class ConnectionMBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private UserService userService;
	
	@Inject
	private CredentialsService credentialsService;

	private String login;

	@Size(min=6)
	private String clearPassword;
	
	private User user;
	private String message;

	private ArrayList<ConnectionListener> listeners;



	public ConnectionMBean() {
		super();

		listeners = new ArrayList<ConnectionListener>();
	}

	public String getDisplayedName() {

		String displayedName;

		if (user == null) {
			displayedName = "Non connecté";
		} else {
			displayedName = user.getFirstName() + " " + user.getLastName();
		}

		return displayedName;

	}

	public String getdisplayedProfilePicture() {

		String displayedProfilePicture;

		if (user == null) {
			displayedProfilePicture = "";
		} else {
			displayedProfilePicture = user.getProfilePicture();
		}
		return displayedProfilePicture;

	}

//	public String connect() {
//
//		utilisateur = ibuUtilisateur.connecter(login, password);
//		String retour = "";
//
//		if (utilisateur != null) {
//			retour = "/index.xhtml?faces-redirect=true";
//			message = "";
//		} else {
//			retour = "/connection.xhtml?faces-redirect=true";
//			message = "Login ou mot de passe incorrect. Veuillez recommencer.";
//		}
//
//		userChange();
//
//		return retour;
//	}
	
	
	public String connect() {
		Credentials credentials = credentialsService.findWithLogin(this.login);
		if(credentials != null) {
			try {
				if(AuthenticationManager.authenticate(clearPassword, credentials)) {
					user = userService.findWithCredentials(credentials);
					return "userHome.xhtml?faces-redirect=true";		
				} else {
					message = "indentifiants incorrects";
					return "userHome.xhtml?faces-redirect=true";
				}

			} catch (Exception e) {
				e.printStackTrace();
				message = e.getMessage();
				return "login.xhtml";
			}
		} else {
			message = "indentifiants incorrects";
			return "login.xhtml";
		}
	}

	public String createAccount() {
		
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

	public String deconnect() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.invalidate();

		userChange();

		return "/connection.xhtml?faces-redirect=true";
	}

	
	

	public boolean isConnected() {
		return user != null;
	}
	
	public boolean isPlayer() {
		if (user == null)
			return false;

		return UserHelper.isPlayer(user);
	}

	public boolean isAdministrator() {
		if (user == null)
			return false;

		return UserHelper.isAdministrator(user);
	}

	



	//===========================================================
	// Listeners

	public void addListener(ConnectionListener l) {

		if (! listeners.contains(l))
			listeners.add(l);
	}

	public void userChange() {
		for (ConnectionListener l : listeners) {
			l.userChanged();
		}
	}
}
