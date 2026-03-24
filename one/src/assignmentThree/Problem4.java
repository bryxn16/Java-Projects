package assignmentThree;
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two positive integers!");
		
		System.out.println("Enter your first POSITIVE nummber: ");
		int firstNum = input.nextInt();
		
		while(firstNum <= 0 )
		{
			System.out.println("Enter your first POSITIVE nummber: ");
			firstNum = input.nextInt();
		}
		
		System.out.println("Enter your second POSITIVE nummber, greater than the first number: ");
		int secondNum = input.nextInt();
		
		while(secondNum <= 0 || secondNum  <= firstNum)
		{
			System.out.println("Enter your second POSITIVE nummber, greater than the first number: ");
			secondNum = input.nextInt();
		}
		
		System.out.println("Here is the list of prime numbers between " + firstNum + " and " + secondNum);

		for(int i = firstNum; i<=secondNum; i++)
		{	
			boolean primeNum = true;
			for(int x = 2; x<i; x++)
			{
				if(i%x == 0)
				{
					primeNum = false;
					break;
				}
			}
			if(primeNum && i>1)
			{
				System.out.print(i + " ");
			}
		}
		input.close();
	}//main

}//class
