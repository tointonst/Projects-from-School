import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPanelDemo extends JFrame
	{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
		{
		final JFrame frame = new JFrame("Alien Craps");
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // Sets JPanel to center of screen

		
		JButton button = new JButton("Enter");
		
		final TextField txtfield = new TextField(20);
		final JLabel words = new JLabel("What is your name?");

		final JPanel panel = new JPanel();
		panel.setBackground(Color.red);
		frame.add(panel);
		panel.add(words);
		
		panel.add(txtfield);
		panel.add(button);
		button.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
					{
					System.out.println(txtfield.getText());
					}
			});

		frame.setVisible(true);
		}
	}