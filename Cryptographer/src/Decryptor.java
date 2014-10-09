
public class Decryptor 
	{
	static String decryptedSentence,textToDecrypt ;
	static StringBuffer reversedBackText ;
	
	public static void decryptor()
		{
		reverseBackSentence();
		replaceBackSentence();
		}
	
	public static StringBuffer reverseBackSentence()
		{
		StringBuffer textToReverseBack = new StringBuffer(Encryptor.encryptedText);
		reversedBackText = textToReverseBack.reverse();
		return reversedBackText;
		}
	
	public static void replaceBackSentence()
		{
		textToDecrypt = reversedBackText.toString();
		decryptedSentence = textToDecrypt.replace("xy", "a").replace("yg", "i").replace("@#$", "e").replace("&*^", "u").replace("%s", "o");
	
		System.out.println(decryptedSentence);
		}
	}
