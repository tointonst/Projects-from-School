import java.util.Scanner;
 
public class IntroToScanner
	{
	static String name, choice;
 	
	public static void main(String[] args)
		{		
		System.out.println("What is your name?");
		
		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();
		
		System.out.println("Hi, " + name);
		
		System.out.println("Do you prefer Chipotle or Qdoba?");
		choice = userInput1.nextLine();
		
		System.out.println("Really?  You like " + choice + " better?");
		
		if ("Chipotle".equals(choice))
		System.out.println("nice choice man");
		
		else
			{	System.out.println("You should change your answer!");
			System.out.println("What do you prefer now");
			}
			
		choice = userInput1.nextLine();
		
			if ("Chipotle".equals(choice))
				System.out.println("Now thats the rihgt answer!");
			
		
		else
			System.out.println("Still the wrong answer!");
		
		System.out.println("What is your favorite thing to get there?");
		choice = userInput1.nextLine();
		
		System.out.println("Really, "+ choice + " is my favorite thing there too");
		
		System.out.println("How much is "+ choice + "?");
		
	
		}

		
	
	}