package assignmentFour;
import java.util.Scanner;
public class ExerciseThree {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		char [] answers = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
		
		char[] studentAnswers = new char[20];
		
		for(int i=0; i<20; i++)
		{
			System.out.println("Question " + (i+1) + ": ");
			studentAnswers[i] = input.next().toUpperCase().charAt(0);
		}
		
		int correct = 0;
		int incorrect = 0;
		
		for(int i=0; i<20; i++)
		{
			if(studentAnswers[i] == answers[i])
			{
				correct++;
			}
			else
			{
				incorrect++;
			}
		}
		if(correct >= 15)
		{
			System.out.println("The student passed :)");
		}
		else
		{
			System.out.println("The student failed :(");
		}
		
		System.out.println("Total correct answers: " + correct);
		System.out.println("Total incorrect answers: " + incorrect);
		System.out.println("Questions that were answered incorrectly:");
		
		for(int i=0; i<20; i++)
		{
			if(studentAnswers[i] != answers[i])
			{
				System.out.println(i+1);
			}
		}
	input.close();
	}//end of main
}//end of class
