package exam1;
import java.util.Scanner;
public class SalesCommision {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double com_rate1 = 0.10;
		double com_rate2 = 0.15;
		double com_rate3 = 0.20;
		
		System.out.println("Enter your sales amount: ");
		double sales = input.nextDouble();
		
		if(sales<=10000)
		{
			double comission = com_rate1 ;
			double comAmount = sales * comission;
			System.out.println("Your commission rate = " + comAmount);
		}
		else if(sales<=15000)
		{
			double comission = com_rate2;
			double comAmount = sales * comission;
			System.out.println("Your commission rate = " + comAmount);
		}
		else
		{
			double comission = com_rate3;
			double comAmount = sales * comission;
			System.out.println("Your commission rate = " + comAmount);
		}
		input.close();
	}//end of main
}//end of class
