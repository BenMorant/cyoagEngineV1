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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String description;
	
    @OneToMany
    private List<Place> places = new ArrayList<Place> ();

	public Map(Integer id, String name, String description, List<Place> places) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.places = places;
	}

}
