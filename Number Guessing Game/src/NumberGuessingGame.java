import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
	{
	
	static String name;
	static int userGuess;
	static int secretNumber;
	static int randomNumberToGuess;
	static int guesscount;
	
	public static void main(String[] args) 
		{	
		greetPlayer();
		generateNumber();
		System.out.println("Guess a number from 1-20 including both 1 and 20");
		while (userGuess != randomNumberToGuess)
			{
			takePlayerGuess();
			evaluateGuess();
			}
		Scanner userInput2 = new Scanner(System.in);
		userGuess = userInput2.nextInt();
		
		}
	public static void evaluateGuess()
		{
		if (userGuess > randomNumberToGuess)
			{
			System.out.println("Nope, that is to high, Guess again!");
			}
		else if (userGuess < randomNumberToGuess)
			{
			System.out.println("Nope, that is to low, Guess again!");
			}
		else if (userGuess < 0 || userGuess > 20)
			{
			System.out.println("That's outside the range. Guess again!");
			}
		else
			{
			System.out.println("Congradulations, you got it!");
			}
		}
		
	
	public static int takePlayerGuess()
		{
		Scanner userInput = new Scanner(System.in);
		userGuess = userInput.nextInt();
		return userGuess;
		}
	
	public static String greetPlayer()
		{
		System.out.println("What is your name?");
		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();
		System.out.println("Hi, " + name);
		return name;
		}
			
	public static int generateNumber()
		{
		Random randomNumber = new Random();
		randomNumberToGuess = 1 + randomNumber.nextInt(20);
		int randomNumberToGuess = 0;
		return secretNumber;
		}
	}
