
public class ForEachLoopPractice
	{

	public static void main(String[] args)
		{
		int totalNumbers = 0;
		int total =0;
		String totalWords = "";
		String [] foodElements = {"fried chicken", "bread", "steak", "fries","fruit"};
		for (String foodType : foodElements)
			{
			System.out.println(foodType);
			}
		System.out.println("");
		
		for (String foodType : foodElements)
			{
			System.out.print(foodType + " ");
			}
		System.out.println("");
		System.out.println("");
		
		int [] fiveNumbers = {5,1,98,18,9,5};
		for (int i = 0; i< fiveNumbers.length; i++)
			{
			if (i % 2 ==0)
				{
				System.out.println(fiveNumbers[i]);
				}
			}
		System.out.println("");
		
		for (int printNumber : fiveNumbers)
			{
			totalNumbers = totalNumbers + printNumber;
			}
		System.out.println("The total of all the numbers is " + totalNumbers + ".");
		System.out.println();
		
		for (String foodType : foodElements)
			{
			if (foodType.contains("e"))
				{
				for(int i =0; i<foodType.length(); i++)
					{
					if (foodType.charAt(i)=='e')
						{
						total++;
						}
					}
				}
			
			} 
		System.out.println(total);
		}
	}
