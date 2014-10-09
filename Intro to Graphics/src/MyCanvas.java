import java.awt.*;
import javax.swing.*;

public class MyCanvas extends Canvas
	{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
		{
		MyCanvas canvas = new MyCanvas();
		JFrame frame = new JFrame();
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(canvas);
		frame.setVisible(true);
		}

	public void paint(Graphics graphics)
		{
		graphics.setColor(Color.pink);
		graphics.fillOval(550, 100, 700, 800);
		graphics.setColor(Color.blue);
		graphics.fillRect(700, 300, 100, 100);
		graphics.fillRect(1000, 300, 100, 100);
		graphics.setColor(Color.black);
		graphics.fillOval(750, 350, 50, 50);
		graphics.fillOval(1000, 350, 50, 50);
		graphics.setColor(Color.lightGray);

		graphics.setColor(Color.black);
		graphics.fillOval(800, 600, 200, 150);
		graphics.setColor(Color.red);
		graphics.drawOval(800, 600, 200, 150);

		}
	}
