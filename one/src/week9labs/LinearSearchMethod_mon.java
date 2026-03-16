package week9labs;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchMethod_mon {

	public static void main(String[] args)
	{
	
	Scanner input = new Scanner(System.in);

	int [] myArray = {45,38 ,27, 46, 81, 72, 56, 61, 45, 20, 48, 76, 91, 57, 35,78};
	int len = myArray.length; //finds length of array
	
	System.out.println("----------------------Part 1----------------------");
	System.out.println("Which number are you looking for?: ");
	int num = input.nextInt();
	boolean found = findNum(myArray, num);
	
	if(found)
		System.out.println("Found");
	else
		System.out.println("NOT Found");
	
	}//main
	public static boolean findNum(int []a, int n)
	{
		int len = a.length; //finds length of array
		for(int i=0; i<len; i++)
		{
			if(n == a[i])
			{
				return = true;
			}
		}

	}
}//class
