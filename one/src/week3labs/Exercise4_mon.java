package week3labs;
import java.util.Scanner; //step 1
public class Exercise4_mon {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //step 2
		
		System.out.println("Enter your first whole number: ");
		System.out.println("Enter your second whole number: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println("***Here is the math for yours numbers***");
		System.out.println("Addition-> " + num1 + " + "+ num2 + " = " + (num1+num2));
		System.out.println("Subtraction-> " + num1 + " - "+ num2 + " = " + (num1-num2));
		System.out.println("Multiplication-> " + num1 + " * "+ num2 + " = " + (num1*num2));
		System.out.println("Division-> " + num1 + " / "+ num2 + " = " + (num1/num2));
		if(num1 == 0 || num2 == 0)
		{
			System.out.println("\t\t\tCant divide by 0");

		}
		System.out.println("Remainder-> " + num1 + " % "+ num2 + " = " + (num1%num2));
		
		
		
		System.out.println("\nThank you for using this program!");



		
		
		
		
		
		input.close(); //step 3
	}

}
