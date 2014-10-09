
public class PrintCompSci
	{

	public static void main(String[] args)
		{
		String computerScience = "COMPUTER SCIENCE ROCKS!";
		String cutComputerScience = computerScience.replaceAll(" ", "");
		

		for (int i = 0; i< cutComputerScience.length(); i++)
			{
			System.out.println(cutComputerScience.charAt(i));
			}

		}

	}
