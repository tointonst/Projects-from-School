import java.util.Scanner;

public class GreetPlayer 
	{
	static String name;
	
	public static void greetPlayer()
		{
		System.out.println("Hello, whats your name?");
		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();
		System.out.println("Nice to meet you " + name + "!");
		System.out.println("We are going to play some Battleship!");
		System.out.println(name + ", your objective is to sink all of the ships. There are a total of three ships.");
		System.out.println("One is 4 coordinates long, another is 3 coordinates long, and the last one is 2 coordinates long.");
		System.out.println();
		System.out.println("This is the game board.");
		}
	}
