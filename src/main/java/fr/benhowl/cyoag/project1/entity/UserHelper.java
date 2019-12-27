package fr.benhowl.cyoag.project1.entity;

public class UserHelper {

	public static boolean isPlayer(User user) {

		boolean result = false;
		
		try {
			@SuppressWarnings("unused")
			Player player = (Player) user;
			result = true;
		} catch (ClassCastException e) {
			//e.printStackTrace();
		}

		return result;
	}

	public static boolean isAdministrator(User user) {

		boolean result = false;
		
		try {
			@SuppressWarnings("unused")
			Administrator administrator = (Administrator) user;
			result = true;
		} catch (ClassCastException e) {
			//e.printStackTrace();
		}

		return result;
	}
}