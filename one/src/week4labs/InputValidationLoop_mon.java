package week4labs;
import java.util.Scanner; //step 1 
public class InputValidationLoop_mon {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //step 2
		
		System.out.println("Please enter 'Y', 'y', 'N', or 'n' only: ");
		char answer = input.next().charAt(0);
		
		System.out.println("Character you entered: " + answer);
		while(answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n')
		{
			System.out.println("Wrong, please enter a character again: ");
			answer = input.next().charAt(0);
		}
		System.out.println("Correct Answer!");
		
		input.close(); //step 3
	}

}
