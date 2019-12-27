package fr.benhowl.cyoag.project1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "place")
public class Place {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private  String name;
	
	private String description;
	
	private float x;
	private float y;
	public Place(Integer id, String name, String description, float x, float y) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.x = x;
		this.y = y;
	}
	
	

}
