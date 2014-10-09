
public class ArrayPractice
	{

	public static void main(String[] args)
		{
		int totalNumbers = 0;
		String [] foodElements = {"fried chicken", "bread", "steak", "fries","fruit"};
		System.out.println(foodElements[2]);
		System.out.println("");
		
		int [] fiveNumbers = {5,1,98,18,9};
		System.out.println(fiveNumbers[fiveNumbers.length-1]);
		System.out.println();
		
		for (int printNumbers : fiveNumbers)
			{
			System.out.println(printNumbers);
			}
		System.out.println("");
		
		for (int printNumbers : fiveNumbers)
			{
			totalNumbers = totalNumbers + printNumbers;
			}
		System.out.println(totalNumbers/fiveNumbers.length);
		}

	}
