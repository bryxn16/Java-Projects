package assignmentOne;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which pacakge did you get: ");
		char pkg = input.next().toUpperCase().charAt(0); //this changes the first letter of input to auto uppercase
		System.out.println("How many minutes were used: ");
		int minsUsed = input.nextInt();
		
		double totalCharge = 9.95;
		switch(pkg)
		{
			case 'A':
				totalCharge = 9.95;
				int pckAmins = 600;
				if(minsUsed>600)
				{
					int extraMins = minsUsed - 600;
					double extraHours = extraMins / 60.0;
					double extraCharge = extraHours * 2.00;
					totalCharge = totalCharge + extraCharge;
				}
				System.out.printf("Your total monthly bill is " + "$%.2f\n",totalCharge);
				break;
			case 'B':
				totalCharge = 13.95;
				int pckBmins = 1200;
				if(minsUsed>1200)
				{
					int extraMins = minsUsed - 1200;
					double extraHours = extraMins / 60.0;
					double extraCharge = extraHours * 1.00;
					totalCharge = totalCharge + extraCharge;
				}
				System.out.printf("Your total monthly bill is " + "$%.2f\n",totalCharge);
				break;
			case 'C':
				totalCharge = 19.95;
				System.out.printf("Your total monthly bill is " + "$%.2f\n",totalCharge);
				break;
		default:
			System.out.println("invalid input, please enter either A/a/B/b/C/c");
		}
		
		input.close();
	}

}