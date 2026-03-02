package week4labs;
import java.util.Scanner;
public class DoWhileLoop_wed {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//accumulator
		int total = 0;
		int product = 0;
		
		for(int i=1; i<=10; i++)
		{
			System.out.print(i + " ");
			total = total + i;
			product = product * i;
		}
		System.out.println("\nTotal = " + total);
		System.out.println("\nProduct = " + product);
		
		/*                  
		System.out.println("Enter a number greater than 0: "); 
		int num = input.nextInt();
		
		while(num<=0) //with basic while loop
		{
			System.out.println("Must be greater than 0, Enter again: ");	this is a while loop same thing
			num = input.nextInt();
		}
		System.out.println("Your number: " + num);
		*/

		
		
		input.close();
	}

}
