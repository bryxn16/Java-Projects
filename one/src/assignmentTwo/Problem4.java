package assignmentTwo;
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer, or -99 to quit: ");
		int count = 0; //this is our counter variable
		int num = input.nextInt();
		int smallest;
		int largest;
		
		if(num!=-99)
		{
			smallest = num;
			largest = num;
			while(num!=-99)
			{
				if(num>largest)
					largest = num;
				if(num<smallest)
					smallest = num;
				count++;
				System.out.println("Enter an integer, or -99 to quit: ");
				num = input.nextInt();
			}
			System.out.println("Largest: " + largest);
			System.out.println("Smallest: " + smallest);
		}//end of if statement
		input.close();
	}//main

}//class
