public class AlexsDecryptor {

	static StringBuffer reverseTextBack;
	static String sentenceDecrypt;
	static String originalSentence;
	
	public static StringBuffer unreverseSentence()
		{
		StringBuffer newSentence = new StringBuffer(Encryptor.userSentence);
		reverseTextBack = newSentence.reverse();
		return reverseTextBack;
		}
	public static String returnOriginalSentence()
		{
		sentenceDecrypt = reverseTextBack.toString();
		originalSentence = sentenceDecrypt.replace("spq", "a").replace("$$$", "i").replace("#@&", "e").replace("*^q", "o").replace("~~~!", "u");
		System.out.println(originalSentence);
		return sentenceDecrypt;
		}
}