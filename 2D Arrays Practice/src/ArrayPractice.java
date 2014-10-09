
public class ArrayPractice 
	{
	
	public static void main(String[] args) 
		{
		assignment1();
		assignment2();
		assignment3();
		extraCredit();
		}
	
	public static void assignment1()
		{
		int numberArray [][] = { {10,20},{30,40},{50,60} };
		
		System.out.println(numberArray[2][1]);
		}
	
	public static void assignment2()
		{
		String [][] mullenArray = new String [4][3];
		for (int i = 0; i < 4; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				mullenArray [i][j] = "MHS ";
				}
			}
		
		for (int i = 0; i < 4; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				System.out.print(mullenArray[i][j]);
				}
			System.out.println();
			}
		}
	
	public static void assignment3()
		{
		int counterNumber = 10;
		int [][] numberArray2 = new int [3][3];
		
		for (int i = 0; i < 3; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				numberArray2 [i][j] = counterNumber;
				counterNumber++;
				}
			}
		int cornersAdded;
		cornersAdded = numberArray2[0][0]+numberArray2[0][2]+numberArray2[2][0]+numberArray2[2][2];
		for (int i = 0; i < 3; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				System.out.print(numberArray2[i][j]);
				System.out.print(" ");
				}
			System.out.println();
			}
		System.out.println("The for corners added together are " + cornersAdded +".");
		}
	public static void extraCredit()
		{
		int counterNumber = 1;
		int [][][] numberArray3 = new int [3][3][3];
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					for (int s = 0; s < 3; s++)
					{
					numberArray3 [i][j][s] = counterNumber;
					counterNumber++;
					}
				}
			}
			
		int counterTotal = 0;
		int countOneNumber = 0;
		for (int i = 0; i < 3; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				for (int s = 0; s < 3; s++)
					{
					numberArray3 [i][j][s] = countOneNumber++;
					counterTotal = counterTotal + countOneNumber;
					}
				}
			}
		
		System.out.println("The total sum of the numbers is " + counterTotal);
		}
	}

