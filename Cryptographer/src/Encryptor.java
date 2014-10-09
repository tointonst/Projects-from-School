import java.util.Scanner;

public class Encryptor 
	{
	static String userSentence;
	static String replacedText;
	static StringBuffer encryptedText;
	
	public static void encryptor()
		{
		askForSentence();
		replaceSentence();
		reverseText();
		printSentence();
		}
	
	public static String askForSentence()
		{
		System.out.println("Input a sentence for me.");
		Scanner userInput = new Scanner(System.in);
		userSentence = userInput.nextLine();
		
		return userSentence;
		}
	
	public static String replaceSentence()
		{
		replacedText = userSentence.replace("a","xy").replace("i", "yg").replace("e", "@#$").replace("u", "&*^").replace("o", "%s");
		
		return replacedText;
		}
	
	public static StringBuffer reverseText()
		{
		StringBuffer textToReverse = new StringBuffer (replacedText);
		encryptedText = textToReverse.reverse();
		return encryptedText;
		}
	
	public static void printSentence()
		{
		System.out.println(encryptedText);
		}
	}