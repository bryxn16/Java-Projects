package week4labs;
import java.util.Scanner;
public class Exercise3_wed {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int sum = 0;  //this is the counting variable
		for(int i=1; i<=7; i++)
		{
			System.out.print("Enter number " + i + ": ");
			int number = input.nextInt();
			sum = sum + number;
		}
		System.out.println("The total sum is: " + sum);
		
		input.close();
	}

}
