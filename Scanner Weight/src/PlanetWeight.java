import java.util.Scanner;


public class PlanetWeight 
	{

	public static void main(String[] args) 
		{
		double weight;
		double weightOnPlanet;
		int choice;
		
		System.out.println("What is your weight in pounds?");
		
		Scanner userInput1 = new Scanner(System.in);
		weight = userInput1.nextDouble();
		
		System.out.println("What is your favorite Planet in our solar system?");
		System.out.println("1-Mercury");
		System.out.println("2-Venus");
		System.out.println("3-Mars");
		System.out.println("4-Jupiter");
		System.out.println("5-Saturn");
		System.out.println("6-Uranus");
		System.out.println("7-Neptune");
		
		//Scanner userInput1 = new Scanner(System.in);
		choice = userInput1.nextInt();
		
		if (choice==1)
			{
			weightOnPlanet = weight * 0.38;
			System.out.println("Your weight on Mercury is " + weightOnPlanet + " pounds!");
			}
		else if (choice==2)
			{
			weightOnPlanet = weight * 0.91;
			System.out.println("Your weight on Venus is " + weightOnPlanet + " pounds!");
			}
		else if (choice==3)
			{
			weightOnPlanet = weight * 0.38;
			System.out.println("Your weight on Mars is " + weightOnPlanet + " pounds!");
			}
		else if (choice==4)
			{
			weightOnPlanet = weight * 2.36;
			System.out.println("Your weight on Jupiter is " + weightOnPlanet + " pounds!");
			}
		else if (choice==5)
			{
			weightOnPlanet = weight * .91;
			System.out.println("Your weight on Saturn is " + weightOnPlanet + " pounds!");
			}
		else if (choice==6)
			{
			weightOnPlanet = weight * .89;
			System.out.println("Your weight on Uranus is " + weightOnPlanet + " pounds!");
			}
		else if (choice==7)
			{
			weightOnPlanet = weight * 1.12;
			System.out.println("Your weight on Neptune is " + weightOnPlanet + " pounds!");
			}
		}

	}
