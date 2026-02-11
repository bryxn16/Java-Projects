package week3labs;
import java.util.Scanner; //step 1
public class AscendingOrder_wed {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter your second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter your third number: ");
		int num3 = input.nextInt();
		
		int small = 0;
		int medium = 0;
		int large = 0;
		
		if(num1<num2 && num1<num3) //first case
		{
			small = num1;
			if(num2<num3)
			{
				medium = num2;
				large = num3;
			}
			else
			{
				medium = num3;
				large = num2;
			}
		}	
		else if(num2<num1 && num2<num3)//second case
		{
			small = num2;
			if(num1<num2)
			{
				medium = num1;
				large = num3;
			}
			else
			{
				medium = num3;
				large = num1;
			}
		}
		else
		{
			small = num3;
			if(num1<num2)
			{
				medium = num1;
				large = num2;
			}
			else
			{
				medium = num2;
				large = num1;
			}
		}
		
		System.out.println("Small: " + small);
		System.out.println("Medium: " + medium);
		System.out.println("Large: " + large);
			
			
		input.close(); //step 3
			
	}

}
