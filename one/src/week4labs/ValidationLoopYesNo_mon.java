package week4labs;
import java.util.Scanner; //step 1 

public class ValidationLoopYesNo_mon {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //step 2
		
		System.out.println("Please enter 'Yes' or 'No' only: ");
		String answer = input.nextLine().toUpperCase();
		System.out.println("Answer you entered: " + answer);
		
		while(answer != ("Yes") || answer != ("No"))
		{
			System.out.println("Please, enter the right answer: ");
			answer = input.nextLine().toUpperCase();
		}
		System.out.println("Correct, same answer inputed!");
		
		input.close(); //step 3
	}
				//unfinished program does not work
}
