package assignmentOne;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		final double COMM_RATE_ONE = 0.10;
		final double COMM_RATE_TWO = 0.15;
		final double COMM_RATE_THREE = 0.20;
		
		System.out.println("Enter your total sales amount: ");
		double sales = input.nextDouble();
		
		if(sales<=10000)
		{
			double commission = COMM_RATE_ONE;
			double comAmount = sales * commission;
			System.out.println("Your comission amount is: " + comAmount);
			
		}
		else if(sales<=15000)
		{
			double commission = COMM_RATE_TWO;
			double comAmount = sales * commission;
			System.out.println("Your comission amount is: " + comAmount);
		}
		else
		{
			double commission = COMM_RATE_THREE;
			double comAmount = sales * commission;
			System.out.println("Your comission amount is: " + comAmount);
		}
			
		input.close();
	}

}
