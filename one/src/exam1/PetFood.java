package exam1;
import java.util.Scanner;
public class PetFood {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Our pet food is available in 3 grades: A, B, C ");
		System.out.println("Which do you want pricing for? ");
		char petfood = input.next().toUpperCase().charAt(0);
		
		switch(petfood)
		{
			case 'A':
			{
				double cost = 30;
				System.out.printf(cost + " cents per pound");
				break;
			}
			case 'B':
			{
				double cost = 20;
				System.out.printf(cost + " cents per pound");
				break;
			}
			case 'C':
			{
				double cost = 15;
				System.out.printf(cost + " cents per pound");
				break;
			}
			default:
			{
			System.out.println("Invalid choice");
			}
		input.close();
		}
	}//end of main
}//end of class
