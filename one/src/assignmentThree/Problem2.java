package assignmentThree;
import java.util.Scanner; //step 1
public class Problem2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	
		System.out.println("For how many students do you have scores?: ");
		int studentCount = input.nextInt();
		
		System.out.println("How many test scores does each student have?: ");
		int testScoreCount = input.nextInt();
		
		for(int i=1; i<=studentCount; i++)
		{
			int total = 0;
			for(int x=1; x<=testScoreCount; x++)
			{
				System.out.println("Enter score " + x + " for student " + i +": ");
				int testScore = input.nextInt();
				total += testScore;
			}
			
			double average = total/testScoreCount;

			System.out.println("\"Total\"" + " score for student " + i + " is: " + total);
			System.out.println("\"Average\"" + " score for student " + i + " is: " + average);
		}
		input.close();
	}//main

}//class
