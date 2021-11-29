package exercise;

import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Generate a random number to be guessed
		int number = (int)(Math.random() * 101);
		int j , i = -1;
		
		System.out.println("This is a guess number program");
	   
	    
	    while (i != number) {
	    	 
	 	    System.out.println("Please enter a number: ");
	 	    j = sc.nextInt();
	 	    
	 	    if (j == number) {
	 	    	System.out.println("Congratulation, you enter the same number");
	 	    }
	 	    else if (j >= number) {
	 	    	System.out.println("Sorry, the number you enter is too high");
	 	    }
	 	   else if (j <= number) {
	 	    	System.out.println("Sorry, the number you enter is too low");
	 	    }
	 	   else {
	 		   System.out.print("The number you enter is undefined");
	 	   }
	 	    
	 	    
	 	    }
	    }

	}


