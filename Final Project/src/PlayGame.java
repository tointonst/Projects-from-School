import java.util.Random;
import java.util.Scanner;

public class PlayGame 
	{
	static String results [][] = { {"miss","miss","miss","miss","miss","miss"} ,{"hit ","miss","miss","miss","hit ", "hit "},
		{"hit ","miss","miss","hit ","miss","miss"}, {"hit ","miss","miss","hit ","miss","miss"}, 
		{"miss","miss","miss","hit ","miss","miss"}, {"miss","miss","miss","hit ","miss","miss"} };
	
	static String results2[][] = { {"hit ","hit ","hit ","hit ","miss","miss"} ,{"miss","miss","miss","miss","miss", "miss"},
		{"miss","hit ","miss","miss","miss","miss"}, {"miss","hit ","miss","hit ","miss","miss"}, 
		{"miss","hit ","miss","hit ","miss","miss"}, {"miss","miss","miss","miss","miss","miss"} };
	
	static String results3[][] = { {"miss","miss","miss","miss","miss","miss"} ,{"miss","miss","miss","miss","miss", "miss"},
		{"miss","hit ","hit ","hit ","hit ","miss"}, {"miss","miss","miss","miss","miss","hit "}, 
		{"miss","miss","miss","miss","miss","hit "}, {"hit ","hit ","miss","miss","miss","hit "} };
	
	static String results4[][] = { {"miss","miss","miss","miss","miss","hit "} ,{"miss","hit ","hit ","hit ","miss", "hit "},
		{"miss","miss","miss","miss","miss","hit "}, {"miss","hit ","miss","miss","miss","hit "}, 
		{"miss","hit ","miss","miss","miss","miss"}, {"miss","miss","miss","miss","miss","miss"} };
	
	static String shipPlacement [][] = new String [6] [6];
	static int firstRowChoice, firstColumnChoice;
	static int counter=0 , counterHit=0 , counterMiss=0;
	static String userCordinate;
	static boolean gameContinues = true;
	
	public static String [][] pickLayout()
		{
		int randomLayoutNumber = 0;
		Random randomNumber = new Random();
		randomLayoutNumber = 1 + randomNumber.nextInt(4);
		
		switch (randomLayoutNumber)
			{
			case 1:
				{
				for (int i = 0; i < 6; i++)
					{
					for (int j = 0; j < 6; j++)
						{
						shipPlacement [i][j] = results [i][j];
						}
					}
				break;
				}
			case 2:
				{
				for (int i = 0; i < 6; i++)
					{
					for (int j = 0; j < 6; j++)
						{
						shipPlacement [i][j] = results2 [i][j];
						}
					}
				break;
				}
			case 3:
				{
				for (int i = 0; i < 6; i++)
					{
					for (int j = 0; j < 6; j++)
						{
						shipPlacement [i][j] = results3 [i][j];
						}
					}
				break;
				}
			case 4:
				{
				for (int i = 0; i < 6; i++)
					{
					for (int j = 0; j < 6; j++)
						{
						shipPlacement [i][j] = results4 [i][j];
						}
					}
				break;
				}
			}
		return shipPlacement;
		}
	
	public static void askUsersGuess()
		{
		
		System.out.println("Which cordinate whould you like to pick? Input it such as A1 or B2");
		while (gameContinues)
			{
			if (GameBoard.startGridArray[firstRowChoice][firstColumnChoice].equals("hit "))
				{
				counterHit++;
				if (counterHit < 9)
					{
					System.out.println("Nice hit! Now sink all the ships.");
					}
				if (counterHit == 9 )
					{
					System.out.println("Congratulations you have sunk all of the ships!");
					System.out.println("It took you " + counter + " tries to sink them.");
					PrintPicture.printPicture();
					gameContinues = false;
					}
				}
			if (GameBoard.startGridArray[firstRowChoice][firstColumnChoice].equals("miss"))
				{
				System.out.println("Sorry but that was a miss! Good try though. Guess again.");
				counterMiss++;
				}
			
			Scanner userInput = new Scanner(System.in);
			userCordinate = userInput.nextLine();
			counter++;
			
			switch(userCordinate.substring(0,1))
				{
				case "A":
				case "a":
					{
					firstRowChoice = 0;
					break;
					}
				case "B":
				case "b":
					{
					firstRowChoice = 1;
					break;	
					}
				case "C":
				case "c":
					{
					firstRowChoice = 2;
					break;	
					}
				case "D":
				case "d":
					{
					firstRowChoice = 3;
					break;	
					}
				case "E":
				case "e":
					{
					firstRowChoice = 4;
					break;	
					}
				case "F":
				case "f":
					{
					firstRowChoice = 5;
					break;	
					}
				}
			
			firstColumnChoice = Integer.parseInt(userCordinate.substring(1)) - 1;
			GameBoard.startGridArray[firstRowChoice][firstColumnChoice]= shipPlacement[firstRowChoice][firstColumnChoice];
			GameBoard.printGameBoard();
			}
		}
	}
	
