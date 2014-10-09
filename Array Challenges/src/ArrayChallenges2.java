import java.util.Random;
import java.util.Scanner;


public class ArrayChallenges2 
	{
	static int numberOfMonth;
	static int randomCardNumber;
	static int randomSuitsNumber;
	static String userSentence;
	static int userNumber;
	
	public static void main(String[] args) 
		{
		int [] numbers = {3,8,6,4,7};
		
		for (int numbersSquared : numbers)
			{
			System.out.println(numbersSquared*numbersSquared);
			}
		String [] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		System.out.println();
		System.out.println("Give me the munber of you birthday month");
		Scanner userInput1 = new Scanner(System.in);
		numberOfMonth = userInput1.nextInt();
		
		System.out.println(months[numberOfMonth-1]);
		
		System.out.println();
		String [] cardSuits = {"hearts","clubs","dimonds","spades"};
		String [] cardNumbers = {"ace","king","queen","jack","ten","nine","eight","seven","six","five","four","three","two"};
		
		int randomCardNumber = 0;
		Random randomNumber = new Random();
		randomCardNumber = randomNumber.nextInt(cardNumbers.length);
		
		int randomSuitsNumber = 0;
		Random randomNumber2 = new Random();
		randomSuitsNumber = randomNumber.nextInt(cardSuits.length);
		
		System.out.println(cardNumbers[randomCardNumber] + " of " + cardSuits[randomSuitsNumber]);
		
		System.out.println();
		System.out.println("Give me a sentence");
		Scanner userInput2 = new Scanner(System.in);
		userSentence = userInput2.nextLine();
		
		
		String sentenceSeperate[] = userSentence.split(" ");
		for (String seperate : sentenceSeperate)
			{
			System.out.println(seperate);
			}
		
		System.out.println();
		System.out.println("Pick a number of which word you want me to print");
		Scanner userInput3 = new Scanner(System.in);
		userNumber = userInput3.nextInt();
		
		System.out.println(sentenceSeperate[userNumber-1]);
		}
		
	
		//public static void sort(sentenceSeperate[])
		//{
			//for (String alphabetical : sentenceSeperate)
			//{
				//System.out.println(alphabetical);
			//}
		//}
	}
