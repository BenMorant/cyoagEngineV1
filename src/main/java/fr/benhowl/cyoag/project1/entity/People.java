package fr.benhowl.cyoag.project1.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@Inheritance
@DiscriminatorColumn(name="peopleType")
@Table (name = "people")
public abstract class People implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
    private String name;
	
	@Column(name = "description")
    private String description;
	
	private int level;
	
	private int magicPoint;
	
	private int experiencePoint;
	
	private int strength;

    @OneToMany
    private List<Image> images = new ArrayList<Image> ();
    
    @OneToOne(mappedBy = "people")
    private Inventory inventory;


}