package fr.benhowl.cyoag.project1.web;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.Part;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@ManagedBean
@SessionScoped
@Getter @Setter @NoArgsConstructor
public class FileImportMBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Part file; 




//TODO : rework


	public void save() {

		try (InputStream input = file.getInputStream()) {
			ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
			String destination = servletContext.getRealPath("resources/images");
			String fileName = file.getSubmittedFileName();
			Files.copy(input, new File(destination, fileName).toPath());
//			Photo prodPhoto = productService.saveInBase(new Photo(fileName, fileName));
//			photos.add(prodPhoto);
//			product.setPhotos(photos);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}





}
