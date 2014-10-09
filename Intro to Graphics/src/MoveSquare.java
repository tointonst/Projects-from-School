import java.awt.*;
import javax.swing.*;

public class MoveSquare extends Canvas
	{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
		{
		MoveSquare canvas = new MoveSquare();
		canvas.setBackground(Color.white);
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(canvas);
		frame.setVisible(true);
		}

	public void paint(Graphics graphics)
		{
		while(true)
			{
			for (int i = 0; i < 1000; i++)
				{
				graphics.setColor(Color.black);
				graphics.fillRect(i, i, 50, 50);
				try
					{
					Thread.sleep(5);
					} catch (InterruptedException e)
					{
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				graphics.setColor(Color.white);
				graphics.fillRect(i, i, 50, 50);
				}
			}
		}
	}