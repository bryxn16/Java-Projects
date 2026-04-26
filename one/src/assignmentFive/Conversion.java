package assignmentFive;
import java.util.Scanner;
public class Conversion 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double meters;
		do
		{
			System.out.println("Enter a distance in meters(positive only): "); //loop for positive distance in meters
			meters = input.nextDouble();
		}while(meters <= 0);
		
		int choice;
		do
		{
			menu();
			System.out.println("Enter your choice: "); //loops for menu output
			choice = input.nextInt();
			
			if(choice == 1)
			{
				showKilometers(meters);
			}
			else if(choice == 2)
			{
				showInches(meters);
			}
			else if(choice == 3)
			{
				showFeet(meters);
			}
			else if(choice == 4)
			{
				System.out.println("Bye!");
			}	
			else
			{
				System.out.println("Invalid Choice");
			}	
		}while(choice != 4);
		
		input.close();
	}//end of main
	public static void showKilometers(double meters)
	{
		double kilometers = meters*0.001;
		System.out.println(meters + " meters is " + kilometers + " kilometers.");
	}//end of showKilometers
	public static void showInches(double meters)
	{
		double inches = meters*39.37;
		System.out.println(meters + " meters is " + inches + " inches.");
	}//end of showInches
	public static void showFeet(double meters)
	{
		double feet = meters*3.281;
		System.out.println(meters + " meters is " + feet + " feet.");
	}//end of showFeet
	public static void menu()
	{
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. quit the program");
	}//end of menu
}//end of class
