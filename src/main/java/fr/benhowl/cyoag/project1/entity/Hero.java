package fr.benhowl.cyoag.project1.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@DiscriminatorValue("Hero")

public class Hero extends People implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private User user;
	

}