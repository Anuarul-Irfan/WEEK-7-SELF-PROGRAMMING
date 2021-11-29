package selfProgramming;

import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int pass;
		int password = 1234;
		
		System.out.println("Please enter your passowrd: ");
		pass = sc.nextInt();
		
		if (pass != password) {
				for (int i =0; i < 2; i++) {
			
				System.out.println("Your password is wrong. Please enter the correct password: ");
				pass = sc.nextInt();
				}
				
		 if(pass != password)
	    	 System.out.println("You entered the wrong password in this attempt. Please reset the system to make a new attempt");
				
		 if(pass == password)
			System.out.println("You enter the correct password");
			
		
		}
	}

}
