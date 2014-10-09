import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class Challenges2 extends Canvas
	{
	private static final long serialVersionUID = 1L;
	static int userWidth;
	static int userLength;
	static int userColorNumber;

	public static void main(String[] args)
		{
		System.out.println("I am going to draw a rectange. How wide do you want it to be? From 100-800");
		Scanner userInput1 = new Scanner(System.in);
		userWidth = userInput1.nextInt();

		System.out.println("I am going to draw a rectange. How long do you want it to be? From 100-800");
		Scanner userInput2 = new Scanner(System.in);
		userLength = userInput2.nextInt();

		System.out.println("I am going to draw a rectange. What color do you want it to be? 1) blue 2) green");
		Scanner userInput3 = new Scanner(System.in);
		userColorNumber = userInput3.nextInt();

		Challenges2 canvas = new Challenges2();
		canvas.setBackground(Color.white);
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(canvas);
		frame.setVisible(true);
		}

	public void paint(Graphics graphics)
		{
		switch (userColorNumber)
			{
			case 1:
				{
				graphics.setColor(Color.blue);
				break;
				}
			case 2:
				{
				graphics.setColor(Color.green);
				break;
				}
			}
		graphics.fillRect(10, 10, userWidth, userLength);
		}
	}
