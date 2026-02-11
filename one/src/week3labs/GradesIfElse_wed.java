package week3labs;
import java.util.Scanner; //step 1
public class GradesIfElse_wed {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //step 2
		
		System.out.println("Please enter your grade, you'll know your GPA: ");
		char grade = input.next().toUpperCase().charAt(0); //this changes the first letter of input to auto uppercase
		
		if(grade == 'A')
			System.out.println("GPA = 4.0");
		else if(grade == 'B')
			System.out.println("GPA = 3.0");
		else if(grade == 'C')
			System.out.println("GPA = 2.0");
		else if(grade == 'D')
			System.out.println("GPA = 1.0");
		else if(grade == 'F')
			System.out.println("GPA = 0.0");
		else
			System.out.println("***please enter a valid grade***");
		
		
		
		input.close(); //step 3
	}

}
