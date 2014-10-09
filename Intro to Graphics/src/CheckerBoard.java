import java.awt.*;

import javax.swing.*;

public class CheckerBoard extends Canvas
	{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
		{
		CheckerBoard canvas = new CheckerBoard();
		canvas.setBackground(Color.white);
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(canvas);
		frame.setVisible(true);
		}

	public void paint(Graphics graphics)
		{

		for (int i = 10; i < 410; i = i + 100)
			{

			for (int j = 10; j < 410; j = j + 100)
				{
				graphics.setColor(Color.green);
				graphics.fillRect(j, i, 50, 50);
				graphics.setColor(Color.blue);
				graphics.fillRect(j + 50, i, 50, 50);
				}
			}
		for (int i = 60; i < 460; i = i + 100)
			{

			for (int j = 10; j < 410; j = j + 100)
				{
				graphics.setColor(Color.green);
				graphics.fillRect(j + 50, i, 50, 50);
				graphics.setColor(Color.blue);
				graphics.fillRect(j, i, 50, 50);
				}
			}
		}
	}