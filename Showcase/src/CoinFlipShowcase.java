//Steve Tointon Coin-Flip Showcase #3
import java.util.Random;
import java.util.Scanner;

public class CoinFlipShowcase 
	{
	
	static String name;
	static int randomComplementNumber;
	static int userFlipNumber;
	static int headsCount = 0;
	static int tailsCount = 0;
	
	public static void main(String[] args) 
		{
		greetPlayer();
		askUserNumberOfFlips();
		flipTheCoins();
		System.out.println("");
		System.out.println("Wow! You fliped " + tailsCount  + " tails, and " + headsCount + " heads!");
		}

	public static String greetPlayer()
		{
		System.out.println("What is your name?");
		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();
		
		String [] randomComplement = {"You are looking really good today!","Your eyes are soo amazing!","I love those shoes that you are wearing!"};
		
		int randomcomplementNumber = 0;
		Random randomNumber = new Random();
		randomComplementNumber = randomNumber.nextInt(randomComplement.length);
		
		System.out.println("Hi, " + name + ". Nice to meet you!");
		System.out.println(randomComplement[randomComplementNumber]);
		return name;
		}
	
	public static int askUserNumberOfFlips()
		{
		System.out.println("");
		System.out.println("Lets flip a coin!");
		System.out.println("How many times do you want me to flip the coin?");
		Scanner userInput2 = new Scanner(System.in);
		userFlipNumber = userInput2.nextInt();
		return userFlipNumber;
		}
	
	public static void flipTheCoins()
		{
		String [] coinOutComes = {"Heads","Tails"};
		int randomCoinNumber = 0;
		Random randomNumber = new Random();
			
		for (int i=0; i<userFlipNumber; i++)
			{
			randomCoinNumber = randomNumber.nextInt(coinOutComes.length);
			System.out.println(coinOutComes[randomCoinNumber]);
			
			if ( randomCoinNumber == 0 )
				{
				headsCount = headsCount + 1;
				}
			else
				{
				tailsCount = tailsCount + 1;
				}
			}
		}
	}