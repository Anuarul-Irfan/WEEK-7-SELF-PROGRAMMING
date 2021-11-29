package selfProgramming;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int number =2; number <20; number++)	
		{
			number = number *2;
			if (number <15)
				System.out.println("Small Number = "+number);
			else
				System.out.println("Big Number = "+number);
			}
		}
	}

