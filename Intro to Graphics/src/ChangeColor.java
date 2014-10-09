import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class ChangeColor extends Canvas
	{
	static int randomNumber1;
	static int randomNumber2;
	static int randomNumber3;
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
		{
		ChangeColor canvas = new ChangeColor();
		JFrame frame = new JFrame();
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(canvas);
		frame.setVisible(true);
		}

	public void paint(Graphics graphics)
		{
		while (true)
			{
			Random randomNumber = new Random();
			randomNumber1 = randomNumber.nextInt(255);

			Random randomNumberTwo = new Random();
			randomNumber2 = randomNumberTwo.nextInt(255);

			Random randomNumberThree = new Random();
			randomNumber3 = randomNumberThree.nextInt(255);

			graphics.setColor(new Color(randomNumber1, randomNumber2,
					randomNumber3));
			graphics.fillRect(10, 10, 500, 500);
			}
		}
	}
