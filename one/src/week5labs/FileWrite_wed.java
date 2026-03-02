package week5labs;
import java.io.*; //step 1: import the file
public class FileWrite_wed {

	public static void main(String[] args) throws IOException
	{
		FileWriter fwriter = new FileWriter("numbers.txt", true);
		PrintWriter outfile = new PrintWriter(fwriter, true); //step 2: open the file
		
		System.out.println("Writing to the file...");
		for(int i=1; i<=10; i++)
		{
			outfile.println(i);
		}
		outfile.println("Bryan Guzman");
		System.out.println("Done writing to the file...");
		
		outfile.close(); //step 3: close the file
	}

}
