package assignmentFour;
import java.io.*; //imports the file
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) throws IOException
	{
		File inputFile  = new File("GirlNames.txt");
		Scanner file = new Scanner(inputFile); //step 2: open the file and read it
		Scanner input = new Scanner(System.in);
		
		String [] names = new String[200];
		
		int i = 0;
		
		while(file.hasNext())
		{
			names[i] = file.next();
			i++;
		}
		
		file.close();
		System.out.println("reading names from the file...");
		System.out.println("Done reading from the file...");

		System.out.println("Enter a girl's name: ");
		String girlName = input.next().toLowerCase();
		
		boolean found = false;
		for(int x=0; x<names.length; x++)
		{
			if(names[x].toLowerCase().equals(girlName))
			{
				found = true;
				break;
			}
		}
		if(found)
		{
			System.out.println("Yes!! " + girlName + " is a popular name.");
		}
		else
			System.out.println("No, " + girlName + " is not a popular name.");
	}//end of main
}//end of class