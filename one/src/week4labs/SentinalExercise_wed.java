package week4labs;
import java.util.Scanner;
public class SentinalExercise_wed {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your textscore, enter -1, when you are done: ");
		int count = 0; //counter variable
		int num = input.nextInt();
		while(num!=-1)
		{
			count++;
			System.out.println("Enter your textscore, enter -1, when you are done: ");
			num = input.nextInt();
		}
		System.out.println("Total number of tests ive taken: " + count);
		System.out.println("Sum of all test scores: ");

		input.close();
	}

}
