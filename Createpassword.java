package selfProgramming;

import java.util.Scanner;
public class Createpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean length = false;
	    	boolean digit = false;
	    	boolean lowercase = false;
	    	boolean uppercase = false;
	    	char ch = 0;
	    	String password;
	    
	    	// Prompt user to enter password
	    	System.out.print("Please enter your password : ");
	    	password = input.nextLine();
	    
	    	// Check what ch is
	    	for (int i = 0; i < password.length(); i++) {
	    		ch = password.charAt(i);
	  
	    		if (Character.isDigit(ch)) {
	    			digit = true;
	    		}
	    		if (Character.isLowerCase(ch)) {
	    			lowercase = true;
	    		}
	    		if (Character.isUpperCase(ch)) {
	    			uppercase = true;
            		}
	    		if (password.length() >= 8) {
	    			length = true;
	    		}
	    	} 
	    
	    		if ((digit == true) && (lowercase == true) && (uppercase == true) && (length == true))
	    			System.out.println("Valid password");
	    		else
	    			System.out.println("Invalid password");
	}

}

	

