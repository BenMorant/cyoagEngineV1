package fr.benhowl.cyoag.project1.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@DiscriminatorValue("administrator")
public class Administrator extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ProfileType getProfile() {

		return ProfileType.administrator;
	}

}
