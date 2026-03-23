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
		
		for(int i=0; i<=studentCount; i++)
		{
			int total = 0;
			for(int x=0; x<=testScoreCount; x++)
			{
				System.out.println("Enter score " + testScoreCount + " for student " + studentCount +": ");
				int testScore = input.nextInt();
				total += testScore;
			}
			
			int average = total/testScoreCount;

			System.out.println("\"Total\"" + " score for student " + studentCount + " is: " + total);
			System.out.println("\"Average\"" + " score for student " + studentCount + " is: " + average);
		}
		
		input.close();
	}

}
