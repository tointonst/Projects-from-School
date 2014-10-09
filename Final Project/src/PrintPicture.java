import java.awt.BorderLayout;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrintPicture 
	{
	//Blake G.'s code
	public static void printPicture()
		{
		Image image = null;
	
		try
			{
			URL url = new URL("http://www.tinysci.com/images/sinkex_fireball_navy-590x307.jpg");
			image = ImageIO.read(url);
			}
		catch (IOException e)
			{
			}
		
		JFrame frame = new JFrame();
		JLabel lblimage = new JLabel(new ImageIcon(image));
		frame.getContentPane().add(lblimage, BorderLayout.CENTER);
		frame.setSize(2000, 1200);
		frame.setVisible(true);
		}
	}
