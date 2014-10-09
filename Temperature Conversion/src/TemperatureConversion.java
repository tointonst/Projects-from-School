import java.util.Scanner;


public class TemperatureConversion 
	{

	public static void main(String[] args) 
		{
		double temperature;
		double celsius=0;
		
		System.out.println("What is your temperature?");
		
		Scanner userInput1 = new Scanner(System.in);
		temperature = userInput1.nextDouble();
		celsius = (temperature - 32) * 5/9;
		System.out.println("The Celsius temperature is "+ celsius );
		}

	}
