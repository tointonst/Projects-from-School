//Steve Tointon Showcase #16

import java.util.Scanner;

public class InchesToCentimeters 
	{
	public static void main(String[] args) 
		{
		double centimeters;
		double inches;
	
		System.out.println("What is a number of inches I can convert to centimeters?");
		Scanner userInput1 = new Scanner(System.in);
		inches = userInput1.nextDouble();
		
		centimeters = inches * 2.54;
		
		System.out.println("There are " + centimeters + " centimeters in " + inches + " inches!");
		} 
	}
