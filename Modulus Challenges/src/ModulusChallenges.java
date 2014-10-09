import java.util.Scanner;


public class ModulusChallenges 
	{
	static int userYear;
	
	public static void main(String[] args) 
		{
		challenge1();
		challenge2();
		challenge3();
		//extraCredit();
		}
	public static void challenge1()
		{
		System.out.println("Input a year for me.");
		Scanner userInput = new Scanner(System.in);
		userYear = userInput.nextInt();
		
		if (userYear % 4 ==0)
			{
			System.out.println("That was a leap year.");
			}
		else
			{
			System.out.println("That wasn't a leap year.");
			}
		System.out.println("");
		}
	public static void challenge2()
		{
		int numberArray [] = {2,4,6,8,10,12,14,16,18,20};
		for (int thirdNumber : numberArray)
			{
			if (thirdNumber % 3 ==0)
				{
				System.out.println(thirdNumber);
				}
			}
		}
	public static void challenge3()
		{
		System.out.println("");
		for (int i = 1; i<101; i++)
			{
			if (i % 3 == 0 & i % 5 == 0)
				{
				System.out.println("FizzBuzz");
				}
			else if (i % 3 ==0)
				{
				System.out.println("Fizz");
				}
			
			else if (i % 5 == 0)
				{
				System.out.println("Buzz");
				}
			else 
				{
				System.out.println(i);
				}
			}
		}
	public static void extraCredit()
		{
		
		for (int i = 1; i < 801; i++)
			{
			if (i % 800 == 0)
				{
				
				}
			}
		}
	}
