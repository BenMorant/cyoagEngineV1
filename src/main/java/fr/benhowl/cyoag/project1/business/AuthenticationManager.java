package fr.benhowl.cyoag.project1.business;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import fr.benhowl.cyoag.project1.entity.Credentials;

public class AuthenticationManager {

	private final static int SALT_LENGTH = 15;
	private final static int MIN_SALT_CHAR_INDEX = '0'; // 33
	private final static int MAX_SALT_CHAR_INDEX = 'z'; // 127
	// 0..9A..Za..z
	
	private static Random random = new Random();
	
	public static void initializeCredentials(String clearPassword, Credentials credentials) throws Exception
	{
		String salt = createSalt();
		String saltedPassword = clearPassword + salt;	
		String hashedPassword = generateHash(saltedPassword);
		credentials.setSalt(salt);
		credentials.setHashedPassword(hashedPassword);
	}
	
	private static String createSalt()
	{
		String salt = "";
	
		for(int i=0; i < SALT_LENGTH; i++)
		{
			int nb = MIN_SALT_CHAR_INDEX + random.nextInt(MAX_SALT_CHAR_INDEX - MIN_SALT_CHAR_INDEX);
			
			salt += (char)nb;
		}
		
		return salt;
	}
	
	public static boolean authenticate(String clearPassword, Credentials credentials) throws Exception{
		
		String hashedPassword = generateHash(clearPassword + credentials.getSalt()); 
		
		return hashedPassword.equals(credentials.getHashedPassword());
	}
	
	private static String generateHash(String source) throws Exception {
		try
		{
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] bytes = md.digest(source.getBytes(StandardCharsets.UTF_8));
			
			StringBuilder sb = new StringBuilder();
			for (byte b : bytes) 
			{
				sb.append(String.format("%02x", b));
			}
			
			return sb.toString();
		}
		catch (NoSuchAlgorithmException e) 
		{
			throw new Exception("Echec de hashage du mot de passe", e);
		}
	}

}
