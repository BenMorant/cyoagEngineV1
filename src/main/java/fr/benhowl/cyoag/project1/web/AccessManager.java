package fr.benhowl.cyoag.project1.web;

import java.util.ArrayList;
import java.util.List;

import fr.benhowl.cyoag.project1.entity.User;

public class AccessManager {
	
	public static class Profile {

		List<Integer> authorizedUserIds;
		
		public Profile(List<Integer> ids) {
			authorizedUserIds = ids;
		}
		
		public static Profile withId(int idUser) {
			
			List<Integer> ids = new ArrayList<Integer>();
			ids.add(idUser);
			
			return new Profile(ids);
		}
	
	}
	
	public static boolean canAccess(User user, Profile profile) {

		if (user == null) {
			return false;
		}
		
		if (profile.authorizedUserIds != null && profile.authorizedUserIds.contains(user.getId())) {
			return true;
		}
				
		return false;
	}
	
}
