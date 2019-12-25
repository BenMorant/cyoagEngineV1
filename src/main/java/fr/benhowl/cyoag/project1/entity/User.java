package fr.benhowl.cyoag.project1.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@Table (name="user")
public class User implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "last_name")
    private String lastName;

	@Column(name = "first_name")
    private String firstName;
	
	@Column(name = "profile_picture")
    private String profilePicture;

	@Column (name = "user_email")
	private String email;
	
    @OneToMany
    private List<Hero> heroes = new ArrayList<Hero> ();

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Credentials credentials;

	public User(Integer id, String lastName, String firstName, String profilePicture, String email,
			Credentials credentials) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.profilePicture = profilePicture;
		this.email = email;
		this.credentials = credentials;
	}

    

}

