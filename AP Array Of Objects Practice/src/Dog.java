import java.util.ArrayList;
public class Dog
	{
	private String nameOfDog;
	private String breed;
	private int age;
	private double weight;
	
	
	public Dog(String nd, String b, int a, double w)
		{
		nameOfDog = nd;
		breed = b;
		age = a;
		weight = w;
		}

	public String getNameOfDog()
		{
		return nameOfDog;
		}

	public String getBreed()
		{
		return breed;
		}

	public int getAge()
		{
		return age;
		}


	public double getWeight()
		{
		return weight;
		}

	public static void main(String[] args)
		{
		ArrayList <Dog> infoOnDogs = new ArrayList<Dog>();
		infoOnDogs.add(new Dog("Rudy", "Jack Russel", 8, 12.6));
		infoOnDogs.add(new Dog("Joe", "Black Lab", 3, 56.6));
		infoOnDogs.add(new Dog("Spot", "Dalmatian", 1, 10.6));
		infoOnDogs.add(new Dog("Rocket", "Great Dane", 6, 135.9));
		infoOnDogs.add(new Dog("Chip", "Huskey", 15, 67.8));
		
		for (Dog x : infoOnDogs)
			{
			System.out.println(x.getNameOfDog() + " the " + x.getBreed() + " is " + x.getAge() + " years old and weighs " + x.getWeight() + " pounds.");
			}
		System.out.println();
		int totalAge =0;
		double totalWeight =0;
		
		for (Dog x : infoOnDogs)
			{
			totalAge = totalAge + x.getAge();
			}
		System.out.println("The average age of the dogs is " + totalAge/infoOnDogs.size() + ".");
		System.out.println("");
		
		for (Dog x : infoOnDogs)
			{
			totalWeight = totalWeight + x.getWeight();
			}
		System.out.println("The total weight of the dogs is " + totalWeight + " pounds.");
		}

	}
