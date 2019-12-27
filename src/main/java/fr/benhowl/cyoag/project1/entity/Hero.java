package fr.benhowl.cyoag.project1.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@DiscriminatorValue("hero")

public class Hero extends People {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
