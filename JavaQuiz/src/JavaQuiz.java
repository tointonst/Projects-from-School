import java.util.Random;

public class JavaQuiz 
	{

	public static void main(String[] args) 
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
		
		int diceFour = 0;
		Random randomNumber4 = new Random();
		diceFour = 1 + randomNumber3.nextInt(6);
		
		int diceFive = 0;
		Random randomNumber5 = new Random();
		diceFive = 1 + randomNumber3.nextInt(6);
		
		int diceSix = 0;
		Random randomNumber6 = new Random();
		diceSix = 1 + randomNumber3.nextInt(6);
		
		int diceSeven = 0;
		Random randomNumber7= new Random();
		diceSeven = 1 + randomNumber3.nextInt(6);
		
		int diceEight = 0;
		Random randomNumber8 = new Random();
		diceEight = 1 + randomNumber3.nextInt(6);
		
		int diceNine = 0;
		Random randomNumber9 = new Random();
		diceNine = 1 + randomNumber3.nextInt(6);
		
		int diceTen = 0;
		Random randomNumber10 = new Random();
		diceTen = 1 + randomNumber3.nextInt(6);
		
		int [] dice = {diceOne,diceTwo,diceThree,diceFour,diceFive,diceSix,diceSeven,diceEight,diceNine,diceTen};
		
		for (int diceNumbers : dice)
			{
			System.out.println(diceNumbers);
			}
		}

	}
