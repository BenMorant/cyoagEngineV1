package fr.benhowl.cyoag.project1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@Inheritance
@DiscriminatorColumn(name="userType")
@Table (name = "user")

public abstract class User implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "last_name")
    private String lastName;

	@Column(name = "first_name")
    private String firstName;
	
	@Column(name = "nickname")
    private String nickName;
	
	@Column(name = "profile_picture")
    private String profilePicture;

	@Column (name = "email")
	private String email;
	
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Credentials credentials;
    
	public enum ProfileType {
		player, administrator
	}
	
	abstract public ProfileType getProfile();

	public User(Integer id, String lastName, String firstName, String nickName, String profilePicture, String email,
			Credentials credentials) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.nickName = nickName;
		this.profilePicture = profilePicture;
		this.email = email;
		this.credentials = credentials;
	}
	
	
	
}



