package fr.benhowl.cyoag.project1.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@DiscriminatorValue("enemy")

public class Enemy extends People implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
