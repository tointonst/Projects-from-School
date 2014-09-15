import java.util.Scanner;

public class SwitchPractice
	{

	public static void main(String[] args)
		{
		whichPolo();
		randomToHundred();
		randomNumberWithUser();
		}

	public static void whichPolo()
		{
		String[] colorOfPolos = { "white", "light blue", "yello", "navy blue", "grey" };
		int randomColorNumber = (int) (Math.random() * 5);
		System.out.println("The next polo color to wear is " + colorOfPolos[randomColorNumber] + ".");

		switch (colorOfPolos[randomColorNumber])
			{
			case "grey":
			case "white":
			case "yello":
				{
				System.out.println("Thats a good color man!");
				break;
				}
			case "light blue":
			case "navy blue":
				{
				System.out.println("It looks like your wearing blue today.");
				}
			}
		System.out.println("");
		}
	
	public static void randomToHundred()
		{
		int counter=0;
		boolean underNinty = true;
		do
			{
			int randomNumber = (int) (Math.random() * 100)+1;
			if (randomNumber>=90)
				{
				underNinty = false;
				}
			counter++;
			}
		while (underNinty);
		
		if(counter ==1)
			{
			System.out.println("It took you one try to generate a number 90 and above.");
			}
		else 
			{
			System.out.println("It took you " + counter + " tries to generate a number 90 and above.");
			}
		System.out.println("");
		}
	
	public static void randomNumberWithUser()
		{
		boolean keepGoing = true;
		System.out.println("I am going to generate a random number.");
		while (keepGoing)
			{
			String answer;
			int newRandomNum = (int) (Math.random() * 100)+1;
			System.out.println("The random number is " + newRandomNum + ".");
			Scanner userInput = new Scanner (System.in);
			System.out.println("Would you like me to make another random number?");
			answer = userInput.nextLine();
			switch (answer)
				{
				case "yes":
				case "Yes":
					{
					System.out.println("Great I will print another number.");
					break;
					}
				case "no":
				case "No":
					{
					System.out.println("Ok cool I will not print another. Goodbye!");
					keepGoing = false;
					}
				}
			}
		}
	}
