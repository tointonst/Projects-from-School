//Steve Tointon Showcase Alien Craps Game
import java.util.Random;
import java.util.Scanner;

public class AlienCrapsGame 
	{
	
	static String name;
	static int diceTotal;
	static int userPoints;
	
	public static void main(String[] args) 
		{
		JPanel.main(args);
		greetPlayer();
		rollDice();
		playGame();
		}
	
	public static String greetPlayer()
		{
		
		System.out.println("What is your name?");
		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();
		System.out.println("Hi, " + name + ". Nice to meet you!");
		System.out.println("Lets play craps!");
		return name;
		}
	
	public static int rollDice()
		{
		int diceOne = 0;
		Random randomNumber = new Random();
		diceOne = 1 + randomNumber.nextInt(6);
		
		int diceTwo = 0;
		Random randomNumber2 = new Random();
		diceTwo = 1 + randomNumber2.nextInt(6);
		
		int diceThree = 0;
		Random randomNumber3 = new Random();
		diceThree = 1 + randomNumber3.nextInt(6);
		
		diceTotal = diceOne + diceTwo + diceThree;
				
		System.out.println("You rolled a " + diceTotal + "!");
		return diceTotal;
		}
	
	public static void playGame()
		{
		userPoints=0;
			
			switch (diceTotal)
			{
			case 3:
			case 4:
			case 5:
			case 16:
			case 17:
			case 18:
				{
				System.out.println("Too Bad, " + name + "! You rolled a " + diceTotal +" and have lost!");
				break;
				}
			case 10:
			case 11:
				{
				System.out.println("Congradulations, " + name + "! You rolled a " + diceTotal +" and have won!");
				break;
				}
			default:
				{
				System.out.println(name + ", your point is " + diceTotal);	
				}	
			}
		}
	}
