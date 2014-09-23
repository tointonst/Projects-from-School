import java.util.ArrayList;
public class ArrayListPractice
	{

	public static void main(String[] args)
		{
		double total = 0;
		double total2 =0;
		ArrayList arrayNumbers = new ArrayList();
		
		arrayNumbers.add(12.4);
		arrayNumbers.add(8.34);
		arrayNumbers.add(90.4);
		arrayNumbers.add(3.4);
		arrayNumbers.add(67.2);
		
		for (int i=0; i<arrayNumbers.size(); i++)
			{
			System.out.println(arrayNumbers.get(i));
			}
		System.out.println();
		
		for (int i=0; i<arrayNumbers.size(); i++)
			{
			total = total + (double)arrayNumbers.get(i);
			}
		System.out.println(total);
		System.out.println();
		
		arrayNumbers.remove(0);
		arrayNumbers.add(8.45);
		arrayNumbers.add(9.24);
		
		for (int i=0; i<arrayNumbers.size(); i++)
			{
			total2 = total2 + (double)arrayNumbers.get(i);
			}
		System.out.println(total2/arrayNumbers.size());
		}

	}
