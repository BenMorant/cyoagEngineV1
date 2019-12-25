package fr.benhowl.cyoag.project1.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "map")
public class Map implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private float x;
	private float y;
	private String name;
	private String description;
	
    @OneToMany
    private List<Place> places = new ArrayList<Place> ();

	public Map(Integer id, float x, float y, String name, String description, List<Place> places) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.name = name;
		this.description = description;
		this.places = places;
	}

}
