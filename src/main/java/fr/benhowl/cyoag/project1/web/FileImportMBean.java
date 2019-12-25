package fr.benhowl.cyoag.project1.web;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.io.IOException;

import javax.annotation.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.Part;

import fr.benhowl.cyoag.project1.business.CredentialsService;
import fr.benhowl.cyoag.project1.business.UserService;
import fr.benhowl.cyoag.project1.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ManagedBean
@ViewScoped
@Getter @Setter @NoArgsConstructor
public class FileImportMBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Part file; 
//	@ManagedProperty(value = "#{mbConnect.utilisateur}")
	private User user;
	
	@Inject
	private UserService userService;
	



	public void save() {

		
		try (InputStream input = file.getInputStream()) {
			ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
			String destination = servletContext.getRealPath("assets/images");
			//TODO : path to check
			String fileName = file.getSubmittedFileName();
			Files.copy(input, new File(destination, fileName).toPath());
			user.setProfilePicture("assets/images/"+fileName);
			user=userService.saveInBase(user);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
