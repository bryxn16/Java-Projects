package assignmentThree;
import java.io.*; //import the file
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) throws IOException
	{
		File inputFile  = new File("numbers.txt");
		Scanner file = new Scanner(inputFile); //step 2: open the file and read it
		
		System.out.println("Reading numbers from the file...");
		
		if(file.hasNextInt())
		{
			int firstNum = file.nextInt();
			int min = firstNum;
			int max = firstNum;
			int count = 1;
			int sum = firstNum;
			while(file.hasNextInt())
			{
				int num = file.nextInt();
				count++;
				sum += num;
				if(num > max)
				{
					max = num;
				}
				if(num < min)
				{
					min = num;
				}
			}
			System.out.println("Total numbers of numbers in the file = " + count);
			System.out.println("Sum of all the numbers in the file = " + sum);
			System.out.println("Min number in the file = " + min);
			System.out.println("Max number in the file = " + max);
		}	
		else
			System.out.println("the file is empty");
		
		System.out.println("Done reading from the file...");
		
		file.close(); //closing the file
	}//main
}//class
