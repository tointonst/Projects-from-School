
public class GameBoard 	
	{
	static String [][] startGridArray = new String [6][6];
	
	public static void fillWithBlanks()
		{
		
		for (int i = 0; i < 6; i++)
			{
			for (int j = 0; j < 6; j++)
				{
				startGridArray [i][j] = "    ";
				}
			}	
		}
	public static void printGameBoard()
		{
		System.out.println("      1      2      3      4       5      6");
		System.out.println("   ___________________________________________");
		System.out.println("A  |      |      |      |      |      |      |");
		System.out.println("   | " + startGridArray[0][0] + " | "  + startGridArray[0][1] + " | " + startGridArray[0][2] + " | " + startGridArray[0][3] + " | " + startGridArray[0][4] + " | " + startGridArray[0][5] + " |");
		System.out.println("   |______|______|______|______|______|______|");
		System.out.println("B  |      |      |      |      |      |      |");
		System.out.println("   | " + startGridArray[1][0] + " | "  + startGridArray[1][1] + " | " + startGridArray[1][2] + " | " + startGridArray[1][3] + " | " + startGridArray[1][4] + " | " + startGridArray[1][5] + " |");
		System.out.println("   |______|______|______|______|______|______|");
		System.out.println("C  |      |      |      |      |      |      |");
		System.out.println("   | " + startGridArray[2][0] + " | "  + startGridArray[2][1] + " | " + startGridArray[2][2] + " | " + startGridArray[2][3] + " | " + startGridArray[2][4] + " | " + startGridArray[2][5] + " |");
		System.out.println("   |______|______|______|______|______|______|");
		System.out.println("D  |      |      |      |      |      |      |");
		System.out.println("   | " + startGridArray[3][0] + " | "  + startGridArray[3][1] + " | " + startGridArray[3][2] + " | " + startGridArray[3][3] + " | " + startGridArray[3][4] + " | " + startGridArray[3][5] + " |");
		System.out.println("   |______|______|______|______|______|______|");
		System.out.println("E  |      |      |      |      |      |      |");
		System.out.println("   | " + startGridArray[4][0] + " | "  + startGridArray[4][1] + " | " + startGridArray[4][2] + " | " + startGridArray[4][3] + " | " + startGridArray[4][4] + " | " + startGridArray[4][5] + " |");
		System.out.println("   |______|______|______|______|______|______|");
		System.out.println("F  |      |      |      |      |      |      |");
		System.out.println("   | " + startGridArray[5][0] + " | "  + startGridArray[5][1] + " | " + startGridArray[5][2] + " | " + startGridArray[5][3] + " | " + startGridArray[5][4] + " | " + startGridArray[5][5] + " |");
		System.out.println("   |______|______|______|______|______|______|");
		}
	
	}