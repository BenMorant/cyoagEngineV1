package fr.benhowl.cyoag.project1.entity;

import java.io.Serializable;

import javax.persistence.Column;
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
@Table(name = "weather")
public class Weather implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String kind;

	private int temperature;
	
	@Column(name = "wind_level")
	private int windLevel;

	public Weather(Integer id, String kind, int temperature, int windLevel) {
		super();
		this.id = id;
		this.kind = kind;
		this.temperature = temperature;
		this.windLevel = windLevel;
	}








}
