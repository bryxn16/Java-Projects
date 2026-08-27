package WeekOne;
import java.util.Scanner;
public class Lab1_Monday_ExerciseB {

	public static void main(String[] args) 
	{
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number from 1-5: ");
		int num = input.nextInt();
		
		if(num == 1)
		{
			System.out.println("Roman numeral is I");
		}
		else if(num == 2)
		{
			System.out.println("Roman numeral is II");
		}
		else if(num == 3)
		{
			System.out.println("Roman numeral is III");
		}else if(num == 4)
		{
			System.out.println("Roman numeral is IV");
		}
		else if(num == 5)
		{
			System.out.println("Roman numeral is V");
		}
		else
			System.out.println("Error, number not in range");
		
		input.close();
	}
}
