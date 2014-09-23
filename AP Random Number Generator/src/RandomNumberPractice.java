
public class RandomNumberPractice
	{

	public static void main(String[] args)
		{
		rollDice();
		coinFlip();
		whichPolo();
		}
	
	public static void rollDice()
		{
		int diceOne = (int)(Math.random() *6)+1;
		int diceTwo = (int)(Math.random() *6)+1;
		int diceTotal = diceOne + diceTwo;
		System.out.println("The total of the two dice are " + diceTotal + ".");
		System.out.println();
		}
	
	public static void coinFlip()
		{
		int headsCount=0;
		int tailsCount =0;
		for(int i =0; i<1000; i++)
			{
			int coinFlip = (int)(Math.random()*2)+1;
			if (coinFlip==1)
				{
				headsCount++;
				}
			if (coinFlip==2)
				{
				tailsCount++;
				}
			}
		System.out.println("Heads was flipped " + headsCount + " times and tails was flipped " + tailsCount + " times.");
		System.out.println("");
		}
	
	public static void whichPolo()
		{
		String[] colorOfPolos = {"white", "light blue", "yello", "navy blue", "grey"};
		int randomColorNumber = (int)(Math.random()*5);
		
		System.out.println("The next polo color to wear is " + colorOfPolos[randomColorNumber] + ".");
		}

	}
