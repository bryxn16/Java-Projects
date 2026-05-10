package help;

import java.lang.reflect.Array;

public class ArrayPractice {

	public static void main(String[] args) 
	{
		int [] num = {1,2,3,5,6,7,8,9,10};
		
		int length = Array.getLength(num);
		int sumNoMiss = 0;
		int sumMiss = 0;
		for(int i=0; i<num.length; i++)  //this adds up each array value
		{
			sumNoMiss += num[i];
		}
		int missingNumber = sumNoMiss - sumMiss;  //finds the missing number
		
		System.out.println("Sum without missing number : " + sumNoMiss);
		System.out.println("Sum wiht missing number : " + sumMiss);
		System.out.println("Missing number : " + missingNumber);
	}
}
