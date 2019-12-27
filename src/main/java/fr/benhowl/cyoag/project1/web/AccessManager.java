package fr.benhowl.cyoag.project1.web;

import java.util.ArrayList;
import java.util.List;

import fr.benhowl.cyoag.project1.entity.User;
import fr.benhowl.cyoag.project1.entity.User.ProfileType;

public class AccessManager {
	
	public static class Profile {

		List<Integer> authorizedUserIds;
		List<ProfileType> authorizedProfileTypes;
		
		public Profile(List<Integer> ids, List<ProfileType> types) {
			authorizedUserIds = ids;
			authorizedProfileTypes = types;
		}
		
		public static Profile withId(int idUser) {
			
			List<Integer> ids = new ArrayList<Integer>();
			ids.add(idUser);
			
			return new Profile(ids, null);
		}
public static Profile administrator() {
			
			List<ProfileType> t = new ArrayList<ProfileType>();
			t.add(ProfileType.administrator);
			
			return new Profile(null, t);
		}
	
	}
	
	public static boolean canAccess(User user, Profile profile) {

		if (user == null) {
			return false;
		}
		
		if (profile.authorizedUserIds != null && profile.authorizedUserIds.contains(user.getId())) {
			return true;
		}
		if (profile.authorizedProfileTypes != null && profile.authorizedProfileTypes.contains(user.getProfile())) {
			return true;
		}
				
		return false;
	}
	
}
