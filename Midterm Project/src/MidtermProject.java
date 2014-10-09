//Steve Tointon Midterm Project

import java.util.Random; 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MidtermProject 
	{
	static String name;
	static int userBet;
	static String[] listOfCards = {"ace of diamonds", "king of diamonds", "queen of diamonds", "jack of diamonds", "ten of diamonds", "nine of diamonds", "eight of diamonds", "seven of diamonds","six of diamonds", "five of diamonds", "four of diamonds", "three of diamonds", "two of diamonds", "ace of spades","king of spades", "queen of spades", "jack of spades", "ten of spades", "nine of spades", "eight of spades", "seven of spades", "six of spades", "five of spades", "four of spades", "three of spades", "two of spades", "ace of clubs", "king of clubs", "queen of clubs", "jack of clubs", "ten of clubs", "nine of clubs", "eight of clubs", "seven of clubs", "six of clubs", "five of clubs", "four of clubs", "three of clubs", "two of clubs", "ace of hearts", "king of hearts", "queen of hearts", "jack of hearts", "ten of hearts", "nine of hearts", "eight of hearts", "seven of hearts", "six of hearts", "five of hearts", "four of hearts", "three of hearts", "two of hearts"};
	static ArrayList <String > deck = new ArrayList<String>();
	static String firstDealtCard;
	static int userPointValue;
	static int userPointTotal=0;

	
	public static void main(String[] args) 
		{
		greetPlayer();
		askForBet(); 
		shuffleAbdDealCards();
		resultsOfTheGame();
		
		}
	
	public static String greetPlayer()
		{
		System.out.println("Hi, What is your name?");
		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();
	
		System.out.println( "Nice to meet you " + name + "!");
		return name;
		}
	public static int askForBet()
		{
		System.out.println("We are gonna play Twenty-One");
		System.out.println("How much would you like to bet?");
		Scanner userInput2 = new Scanner(System.in);
		userBet = userInput2.nextInt();
		System.out.println("");
		return userBet;
		}
	public static int shuffleAbdDealCards()
		{
		for (String cards : listOfCards)
			{
			deck.add(cards);
			}
			Collections.shuffle(deck);
	
	
		while (userPointTotal <=21)
			{
			firstDealtCard= deck.get(0);
			System.out.println(firstDealtCard);
			deck.remove(0);
			switch(firstDealtCard.substring(0,3))
				{
				case "ace":
					{
					userPointValue = 11;
					break;
					}
				case "kin":
				case "que":
				case "jac":
				case "ten":
					{
					userPointValue = 10;
					break;
					}
				case "nin":
					{
					userPointValue = 9;
					break;
					}
				case "eig":
					{
					userPointValue = 8;
					break;
					}
				case "sev":
					{
					userPointValue = 7;
					break;
					}
				case "six":
					{
					userPointValue = 6;
					break;
					}
				case "fiv":
					{
					userPointValue = 5;
					break;
					}
				case "fou":
					{
					userPointValue = 4;
					break;
					}
				case "thr":
					{
					userPointValue = 3;
					break;
					}
				case "two":
					{
					userPointValue = 2;
					break;
					}
				}
			userPointTotal = userPointTotal + userPointValue;
			}
		System.out.println("You now have " + userPointTotal + " points!");	
		return userPointTotal;
		}
	public static void resultsOfTheGame()
		{
		if (userPointTotal == 21)
			{
			System.out.println("Congradulations, You won and won " + userBet*2 + "dollars!");
			}
		if (userPointTotal > 21)
			{
			System.out.println("Sorry but you busted and lost all your money!");
			}
		else
			{
			System.out.println("Here's your money back, sorry but i gotta run!");
			}
		}
	}