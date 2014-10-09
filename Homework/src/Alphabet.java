
public class Alphabet
	{

	public static void main(String[] args)
		{
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String upperCaseAlphabet = alphabet.toUpperCase();
		
		for (int i = 0; i< alphabet.length(); i++)
			{
			System.out.println(alphabet.charAt(i));
			}
		for (int i = 0; i< upperCaseAlphabet.length(); i++)
			{
			System.out.println(upperCaseAlphabet.charAt(i));
			}

		}

	}
