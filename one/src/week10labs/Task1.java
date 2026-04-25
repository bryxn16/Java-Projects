package week10labs;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) 
	{
		java.util.Scanner input = new Scanner(System.in);

		System.out.println("Enter month (numeric): ");
		int month = input.nextInt();
		
		System.out.println("Enter a day: ");
		int day = input.nextInt();
		
		System.out.println("Enter a two digit year");
		int year = input.nextInt();
		
		if(month + day == year)
		{
			System.out.println("The date is special");
		}
		else 
		{
			System.out.println("The date is NOT special");
		}
		
		
		
		
		
		input.close();
	}

}
