package fr.benhowl.cyoag.project1.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.ManagedProperty;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@SessionScoped
@Getter @Setter
public class NavigationMBean implements Serializable, ConnectionListener {

	public class MenuItem {

		@SuppressWarnings("unused")
		private String label;

		@SuppressWarnings("unused")
		private String url;

		@SuppressWarnings("unused")
		private List<MenuItem> subItems;

		public MenuItem(String label, String url) {
			super();
			this.label = label;
			this.url = url;
			this.subItems = new ArrayList<MenuItem>();
		}


	}

	//=====================================================================
	//	Attributs

	private static final long serialVersionUID = 1L;

	public static String forbiddenUrl = "/forbidden";

	private String websiteTitle = "Choose Your Own Adventure Game";

	@ManagedProperty(value="#{connectionMBean}")
	private ConnectionMBean connectionMBean;

	private List<MenuItem> menuItems;

	//=====================================================================
	//	Initialization

	@PostConstruct
	public void init() {

		connectionMBean.addListener(this);

		menuItems = new ArrayList<MenuItem>();
		//		
		//		MenuItem menuCandidature = new MenuItem("Candidatures", "#");
		//		
		//		if (! mbConnect.isConnecte()) {
		//			menuCandidature.getSubItems().add(new MenuItem("Déposer une candidature", "precandidature"));
		//		}
		//		
		//		if (mbConnect.isStagiaire()) {
		//			menuCandidature.getSubItems().add(new MenuItem("Nouvelle candidature", "dossiercandidature"));
		////			TODO to Complete
		//			menuCandidature.getSubItems().add(new MenuItem("Suivre une candidature", "listeCandidatures"));
		//		}
		//		
		//		if (mbConnect.isAdministration()) {
		//			menuCandidature.getSubItems().add(new MenuItem("Candidatures en cours", "listeCandidatures"));			
		//		}
		//		
		//		menuItems.add(menuCandidature);
		//
		//		if (mbConnect.isAdministration()) {
		//
		//			MenuItem menuRH = new MenuItem("Espace RH", "#");
		//			menuRH.getSubItems().add(new MenuItem("Intervenants", "intervenants"));
		//			menuRH.getSubItems().add(new MenuItem("Stagiaires", "stagiaires"));
		//			menuItems.add(menuRH);
		//
		//			MenuItem menuPedago = new MenuItem("Espace pédagogie", "#");
		//			menuPedago.getSubItems().add(new MenuItem("Cursus", "cursus"));
		//			menuPedago.getSubItems().add(new MenuItem("Promotions", "promotions"));
		//			menuItems.add(menuPedago);
		//		}
	}

	@Override
	public void userChanged() {
		init();
	}



}