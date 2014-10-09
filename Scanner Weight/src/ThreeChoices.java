import java.util.Scanner;


public class ThreeChoices 
	{

	public static void main(String[] args) 
		{
		
		int choice; 
		
		System.out.println("What is your favorite desert out of these choices?");
		System.out.println("1- Cookies");
		System.out.println("2- Cake");
		System.out.println("3- Pie");
		
		Scanner userInput1 = new Scanner(System.in);
		choice = userInput1.nextInt();
		
		if (choice==1)
			System.out.println("Nice cookies are good!");
		
		else if (choice==2)
			System.out.println("Cake is a good choice!");
		
		else if (choice==3)
			System.out.println("Pie is my favorite also!");

		}

	}
