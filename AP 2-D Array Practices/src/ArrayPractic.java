
public class ArrayPractic
	{

	public static void main(String[] args)
		{
		printNine();
		printMustang();
		printBox();
		}
	
	public static void printNine()
		{
		int numberArray[][] = {{2,4,6,8},{3,6,9,12},{4,8,12,16}};
		System.out.println(numberArray[1][2]);
		System.out.println("");
		}
	
	public static void printMustang()
		{
		String mustangArray[][] = new String [5][3];
		for (int row = 0; row<5; row++)
			{
			for (int column =0; column<3; column++)
				{
				mustangArray[row][column] = "Mustang    ";
				}
			}
		for (int row = 0; row<5; row++)
			{
			for (int column =0; column<3; column++)
				{
				System.out.print(mustangArray[row][column]);
				}
			System.out.println("");
			}
		System.out.println("");
		}
	
	public static void printBox()
		{
		int counter=10;
		
		int numbersInBoxArray[][] = new int [3][3];
		for (int row = 0; row<3; row++)
			{
			for (int column =0; column<3; column++)
				{
				numbersInBoxArray[row][column] = counter;
				counter = counter + 10;
				}
			}
		for (int row = 0; row<3; row++)
			{
			for (int column =0; column<3; column++)
				{
				System.out.print(numbersInBoxArray[row][column]);
				System.out.print("  ");
				}
			System.out.println("");
			}
		int totalCorners = (numbersInBoxArray[0][0] + numbersInBoxArray[0][2] + numbersInBoxArray[2][0] + numbersInBoxArray[2][2]);
		System.out.println("The total of the corners are " + totalCorners + ".");
		}
	}
