public class Analyzer
	{

	public static void main(String[] args)
		{
		printNumberOfRecords();
		findQs();
		startWithG();
		findLenghtSix();
		}

	public static void printNumberOfRecords()
		{
		Data.addData();
		System.out.println("There are " + Data.data.size() + " records in the database.");
		System.out.println("");
		}

	public static void findQs()
		{
		int counterTotalQs = 0;
		for (int i = 0; i < Data.data.size(); i++)
			{
			if (Data.data.get(i).getLetterCode().contains("qqq"))
				{
				counterTotalQs = counterTotalQs + 1;
				}
			}
		System.out.println("There are " + counterTotalQs + " occurrences of \"qqq\" in the Data.");
		System.out.println("");
		}

	public static void startWithG()
		{
		double counterTotalGs = 0;
		for (int i = 0; i < Data.data.size(); i++)
			{
			if (Data.data.get(i).getLetterCode().substring(0, 1).equals("g"))
				{
				counterTotalGs = counterTotalGs + 1;
				}
			}
		System.out.println("There are " + counterTotalGs + " records beginning with the letter \"g\".");
		System.out.println("That is "+ (counterTotalGs / Data.data.size() * 100) + "% of the records.");
		System.out.println("");
		}

	public static void findLenghtSix()
		{
		int counterTotalWithSix = 0;
		for (int i = 0; i < Data.data.size(); i++)
			{
			if (Data.data.get(i).getLetterCode().length() == 6)
				{
				counterTotalWithSix = counterTotalWithSix + 1;
				}
			}
		System.out.println("There are " + counterTotalWithSix + " lettercodes of length six.");

		}

	}
