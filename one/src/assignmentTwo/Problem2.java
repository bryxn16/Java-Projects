package assignmentTwo;
import java.util.Scanner; //step 1
public class Problem2 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the vehicle's speed: ");
		double speed = input.nextDouble();
		
		while(speed<=0)
		{
			System.out.print("Enter greater than 0 for speed: ");
			speed = input.nextDouble();
		}
		
		System.out.print("Enter the number of hours the vehicle was in motion: ");
		int hours = input.nextInt();
		
		while(hours<=0)
		{
			System.out.print("Enter greater than 0 for hours: ");
			hours = input.nextInt();
		}
		
		System.out.println("----------------------------");
		System.out.printf("%-10s %-15s\n","Hour", "Distance Traveled");
		System.out.println("----------------------------");

		
		for(int i=1; i<=hours; i++)
		{
			double distance = speed*i; //i and not hours because hours would be giving us one final value as with i it continues the value 
			System.out.printf("%-10d %.3f\n",i, distance);//same here with i instead of hours
		}
		
		input.close();
	}

}
