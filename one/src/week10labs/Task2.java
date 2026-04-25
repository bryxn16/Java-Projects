package week10labs;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) 
	{
		java.util.Scanner input = new Scanner(System.in);

		System.out.println("Enter an objects mass: ");
		double mass = input.nextDouble();
		
		double weight = mass*(9.8);
		
		if(weight<10)
		{
			System.out.println("Object is too light: ");
			mass = input.nextDouble();
		}
		else if(weight<0)
		{
			System.out.println("An objects mass cannot be negative: ");
			mass = input.nextDouble();
		}
		else
		{
			System.out.print("From the objects mass of " + mass + " It's weight is " + weight);
		}
		

		
		
		
		input.close();
	}

}
