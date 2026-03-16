package week9labs;
import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch_mon {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int [] myArray = {45,38 ,27, 46, 81, 72, 56, 61, 45, 20, 48, 76, 91, 57, 35,78};
		int len = myArray.length; //finds length of array
		
		System.out.println("----------------------Part 1----------------------");
		System.out.println("Which number are you looking for?: ");
		int num = input.nextInt();
		boolean found = false;
		for(int i=0; i<len; i++)
		{
			if(num == myArray[i])
			{
				found = true;
			}
		}
		if(found)
			System.out.println("Found");
		else
			System.out.println("NOT Found");

		System.out.println("----------------------Part 2----------------------");
		int index = -1;
		for(int i=0; i<len; i++)
		{
			if(num == myArray[i])
			{
				//found = true;
				index = i;
				break; //break statement helps the first 45 be printed and not the last at index 8
			}
		}
		if(index != -1)
			System.out.println(num + " found at index: " + index);
		else
			System.out.println(num + " Not found");

		System.out.println("----------------------Part 3----------------------");
		int count = 0;
		for(int i=0; i<len; i++)
		{
			if(num == myArray[i])
			{
				count++;
			}
		}
		if(count != 0)
			System.out.println("We have " + count + " of these numbers");
		else
			System.out.println(num + " is not in the array");

		System.out.println("----------------------Part 4----------------------");
		System.out.println("Numbers greater than " + num + "...");
		int c = 0;
		for(int i=0; i<len; i++)
		{
			if(num < myArray[i])
			{
				System.out.print(myArray[i] + " ");
				c++;
			}
		}
		if(c==0)
		{
			System.out.println("no number to display that is great than " + num);
		}
		
		Arrays.sort(myArray);

		for(int i=0; i<len; i++)
		{
			if(num < myArray[i])
			{
				System.out.print(myArray[i] + " ");
				c++;
			}
		}
		
		input.close();	
		
	}//end of main

}// end of class
