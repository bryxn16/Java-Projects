package week3labs;
import java.util.Scanner; //step 1
public class IFexercise_mon {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);// step 2
		
		System.out.println("Enter the day of the week: ");
		int day = input.nextInt();
		
		if(day == 1)
		{
			System.out.println("Sunday");
			System.out.println("First day of the week");
		}
		else if (day == 2)
			System.out.println("Monday");
		else if (day == 3)
			System.out.println("Tuesday");
		else if (day == 4)
			System.out.println("Wednesday");
		else if (day == 5)
			System.out.println("Thursday");
		else if (day == 6)
			System.out.println("Friday");
		else if (day == 7)
			System.out.println("Saturday");
		else 
			System.out.println("please enter 1-7 only");
		
		
		input.close(); //step 3
		
		
		
		
	}

}
