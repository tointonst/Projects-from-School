import java.util.Scanner;


public class ScannerWeight 
	{

	public static void main(String[] args) 
		{
		double meters;
		double inches;
		
		System.out.println("What is a number of meters I can convert to inches?");
		
		Scanner userInput1 = new Scanner(System.in);
		meters = userInput1.nextDouble();
		inches = meters * 39.3701;
		System.out.println("There are " + inches + " inches in " + meters + " meters");
		} 

	}
