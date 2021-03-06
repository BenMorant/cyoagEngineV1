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
@Table(name = "credentials")
public class Credentials implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String login;

    @Column(name = "hashed_password")
    private String hashedPassword;

    private String salt;
    
    public Credentials (String login) {
    	this.login = login;
    }

	public Credentials(Integer id, String login, String hashedPassword, String salt) {
		super();
		this.id = id;
		this.login = login;
		this.hashedPassword = hashedPassword;
		this.salt = salt;
	}
   
}
