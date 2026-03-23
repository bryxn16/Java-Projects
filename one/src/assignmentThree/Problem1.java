package assignmentThree;
import java.util.Scanner; //step 1
public class Problem1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		
		System.out.println("Enter a number for character position in this string: ");
		int position = input.nextInt();
		
		while(position < 0 || position >= str.length())
		{
			if(position<0)
			{
				System.out.println("Position number can't be negative: ");
				System.out.println("Enter position number again: ");
				position = input.nextInt();
			}
			else if(position >= str.length())
			{
				System.out.println("Your string is smaller than the position number");
				System.out.println("Enter position number again: ");
				position = input.nextInt();
			}
			
		}
		showChar(str, position);
		
		input.close();
	}// end of main
	public static void showChar(String str, int position)
	{
		char index = str.charAt(position);
		System.out.println("character in string " + "\"" + str + "\"" + " at position number " + position + " is: " + index);
	}

}//end of class
