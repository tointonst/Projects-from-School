import java.util.ArrayList;
import java.util.Scanner;
public class Student
	{
	private String name;
	private int score;
	static ArrayList <Student> results = new ArrayList<Student>();
	
	public Student(String n, int s)
		{
		name = n;
		score = s;
		}
	
	public String getName()
		{
		return name;
		}
	
	public void setName(String name)
		{
		this.name = name;
		}
	
	public int getScore()
		{
		return score;
		}
	
	public void setScore(int score)
		{
		this.score = score;
		}

	
	public static void main(String[] args)
		{
		results.add(new Student("Waka", 7));
		results.add(new Student("Jim", 45));
		results.add(new Student("Tristan", 99));
		results.add(new Student("Ryan", 100));
		results.add(new Student("LeBryan", 78));
		
		
		printScores();
		addStudent();
		printScores();
		adjustScores();
		printScores();
		}
	
	public static void printScores()
		{
		System.out.println("");
		for(Student x : results)
			{
			System.out.println("Name : " + x.getName() + "\tScore: " + x.getScore() );
			}
		}
	public static void addStudent()
		{
		System.out.println("");
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the name of the student?");
		String newName = userInput.nextLine();
		System.out.println("What is the score of the Student?");
		int newScore = userInput.nextInt();
		results.add(new Student(newName, newScore));
		}
	public static void adjustScores()
		{
		System.out.println("");
		System.out.println("The Adjusted Scores are:");
		for(int i=0; i <results.size(); i++)
			{
			if (results.get(i).getScore() < 50)
				{
				results.get(i).setScore(55);
				}
			}
		}

	}
