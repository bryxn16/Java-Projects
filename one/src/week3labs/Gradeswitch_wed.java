package week3labs;
import java.util.Scanner; //step 1
public class Gradeswitch_wed {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //step 2
		
		System.out.println("Please enter your grade, you'll know your GPA: ");
		char grade = input.next().toUpperCase().charAt(0); //this changes the first letter of input to auto uppercase
		
		switch(grade) 
		{
			case 'A':
				System.out.println("GPA = 4.0");
				break;
			case 'B':
				System.out.println("GPA = 3.0");
				break;
			case 'C':
				System.out.println("GPA = 2.0");
				break;
			case 'D':
				System.out.println("GPA = 1.0");
				break;
			case 'F':
				System.out.println("GPA = 0.0");
				break;
			default:
				System.out.println("Please enter a valid grade");	
		}
		input.close(); //step 3
	}

}

