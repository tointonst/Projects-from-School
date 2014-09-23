
public class StringExercises
	{

	public static void main(String[] args)
		{
		String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		String cutAlphabet = alphabet.replaceAll(" ", "");
		System.out.println(cutAlphabet);
		int countSpaces = 0;
		
		for (int i = 0; i<cutAlphabet.length(); i++)
			{
			if (i % 2 == 0)
				{
				System.out.print(cutAlphabet.charAt(i) + " ");
				}
			}
		System.out.println("");
		
		for (int i = 0; i<cutAlphabet.length(); i++)
			{
			if (i % 2 == 1)
				{
				System.out.print(cutAlphabet.charAt(i) + " ");
				}
			}
		System.out.println("");
		for (int i = 0; i<26; i++)
			{
			System.out.println(cutAlphabet.charAt(i));
			}
		System.out.println("The number of Characters including spaces is " + alphabet.length() + ".");
		
		for (int i = 0; i<alphabet.length(); i++)
			{
			if (alphabet.substring(i,i+1).equals(" "))
				{
				countSpaces++;
				}
			}
		
		System.out.println("The number of spaces are " + countSpaces + ".");
		}

	}
