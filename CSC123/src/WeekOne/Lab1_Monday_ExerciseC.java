package WeekOne;
import java.util.Scanner;
public class Lab1_Monday_ExerciseC {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number from 1-5: ");
		int num = input.nextInt();
		
		switch(num)
		{
		case 1:
		{
			System.out.println("Roman numeral is I");
			break;
		}
		case 2:
		{
			System.out.println("Roman numeral is II");
			break;
		}
		case 3:
		{
			System.out.println("Roman numeral is III");
			break;
		}
		case 4:
		{
			System.out.println("Roman numeral is IV");
			break;
		}
		case 5:
		{
			System.out.println("Roman numeral is V");
			break;
		}
		default:
			System.out.println("Error, number not in range");
		}
		
		input.close();
	}
}
