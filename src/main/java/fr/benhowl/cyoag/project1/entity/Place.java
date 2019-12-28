package fr.benhowl.cyoag.project1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	@Column(name = "id")
	private Integer id;
	
	private  String name;
	
	private String description;
	
	private float x;
	private float y;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Weather weather;
	
	@ManyToOne
	//@JoinColumn(referencedColumnName="id")
	private Region region;
	

}
