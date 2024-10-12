package javaprograms;

import java.util.Scanner;

public class EvenNumbers {
	
	
	
	Scanner scanner = new Scanner(System.in);
	String choice;
	

	public void evenNumbers() {
		
		System.out.println("Enter number : ");
		int number = scanner.nextInt();
		
		System.out.println("Evern numbers are:");
		
		for(int i=1;i<= number;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}
	
	public void askAgain()
	{
		System.out.println("You want to Continue.. Y/N");
		choice = scanner.next();
		if(choice.equalsIgnoreCase("y"))
		{
			evenNumbers();
		}
		else
		{
			System.out.println("Thanks for checking Bye Bye!");
			
		}
		
		
	}
	
	
	

	public static void main(String args[]){
		
		EvenNumbers evenNumbers = new EvenNumbers();
		evenNumbers.evenNumbers();
		System.err.println();
		evenNumbers.askAgain();
		
	}
}
