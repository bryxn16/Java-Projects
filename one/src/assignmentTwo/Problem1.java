package assignmentTwo;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = input.nextLine(); //first String for initial input that user gave
		String lowstr = str.toLowerCase(); //second String to actually have it seperates for the program itself
		
		System.out.println("Enter a letter contained in the string: ");
		char letter = input.nextLine().charAt(0); //first char for initial input that user gave
		char lowletter = Character.toLowerCase(letter); //second char to actually have it seperate for the program itself
		
		int count = 0;
		for(int i=0; i<lowstr.length(); i++)
		{
			if(lowstr.charAt(i) == lowletter)
			{
				count += 1;
			}
		}
		System.out.println("The letter " + "'" + letter + "'" + " appears " + count + " times in the string " + "\"" + str + "\"" + ".");
		//adding the \" in between the "" seperates the commas with whats inside to allow to give that single comma output
		
		input.close();	
	}

}
