import java.util.Scanner;


public class StringMethodChallenges 
	{
	static String userShout;
	static String lowerCaseSentence;
	static int vowelCounter = 0;
	
	
	public static void main(String[] args) 
		{
		System.out.println("Imput a sentence in all upercase for me an I will make it lowecase and turn it horizontal.");
		Scanner userInput1 = new Scanner(System.in);
		userShout = userInput1.nextLine();
		lowerCaseSentence= userShout.toLowerCase();
		
		System.out.println("");
		System.out.println(userShout.substring(0,1) + lowerCaseSentence.substring(1,lowerCaseSentence.length()));
		
		System.out.println("");
		for (int i=0; i < userShout.length(); i++)
			{
			System.out.println(userShout.substring(i,i+1));
			}
		
		System.out.println("");
		for (int i = 0; i < lowerCaseSentence.length(); i++)
			{
			switch (lowerCaseSentence.substring(i,i+1))
				{
				case "a":
				case "e":
				case "i":
				case "o":
				case "u":
					{
					vowelCounter++;
					}
				}	
			}	
		System.out.println("There are " + vowelCounter + " vowels in your sentence.");
		}
	}
