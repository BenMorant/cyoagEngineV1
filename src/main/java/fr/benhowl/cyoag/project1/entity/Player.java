package fr.benhowl.cyoag.project1.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@DiscriminatorValue("player")
public class Player extends User{
	
	
    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany
    private List<Game> games;
	
	@Override
	public ProfileType getProfile() {
		
		return ProfileType.player;
	}

	public Player(Integer id, String lastName, String firstName, String nickName, String profilePicture, String email,
			Credentials credentials, List<Game> games) {
		super(id, lastName, firstName, nickName, profilePicture, email, credentials);
		this.games = games;
	}

	
	
}
