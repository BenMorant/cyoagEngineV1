package fr.benhowl.cyoag.project1.web;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import fr.benhowl.cyoag.project1.business.CredentialsService;
import fr.benhowl.cyoag.project1.business.UserService;
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


	@Inject
	private UserService userService;

	private String login;
	private String password;
	private User user;
	private String message;

	private ArrayList<ConnectionListener> listeners;



//	public ConnectionMBean() {
//		super();
//
//		listeners = new ArrayList<ConnectionListener>();
//	}

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

	public String deconnect() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.invalidate();

		//userChange();

		return "/connection.xhtml?faces-redirect=true";
	}

	
	

	public boolean isConnected() {
		return user != null;
	}



	//===========================================================
	// Listeners

//	public void addListener(ConnectionListener l) {
//
//		if (! listeners.contains(l))
//			listeners.add(l);
//	}
//
//	public void userChange() {
//		for (ConnectionListener l : listeners) {
//			l.userChanged();
//		}
//	}
}
