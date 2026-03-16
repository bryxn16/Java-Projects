package week9labs;
import java.util.Scanner;
public class StringArray_mon {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		String [] name = {"nameOne", "nameTwo", "nameThree", "nameFour", "nameFive"};
		
		int len = name.length;
		boolean found = false;

		for(int i=0; i<len; i++)
		{
			System.out.println(name[i] + " ");
		}
		  
		System.out.println("Which name are you looking for?: ");
		String look =input.next();
		  
		for(int i=0; i<len; i++)
		{
			if(look.equalsIgnoreCase(name[i]))
			{
				found = true;
				break;
				//System.out.println("Found");
			}
			//else
				//System.out.println("NOT Found");
			
			
		}


		  input.close();
	}

}
