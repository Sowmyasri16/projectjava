package generation;
import java.util.*;


	public class Tester{
	   public static void main(String[] args) {
	      System.out.println(generatePassword(6));
	   }

	   private static char[] generatePassword(int length) {
	      String capitalCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@%?#$";
	      String numbers = "0123456789";
	      String combinedChars = capitalCase + lowerCase+ specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCase.charAt(random.nextInt(lowerCase.length()));
	      password[1] = capitalCase.charAt(random.nextInt(capitalCase.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	   }
	}


