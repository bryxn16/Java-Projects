package help;

public class ArrayPractice {

	public static void main(String[] args) 
	{
		int [] num = {1,2,3,5,6,7,8,9,10};
		
		int length = num.length;
		int sumNoMiss = 0;
		int sumMiss = 0;
		for(int i=0; i<length; i++)  
		{
			//this adds up each array value
			sumNoMiss += num[i];
		}
		//finds the missing number
		int missingNumber = sumNoMiss - sumMiss;  
		System.out.println("Sum without missing number : " + sumNoMiss);
		System.out.println("Sum wiht missing number : " + sumMiss);
		System.out.println("Missing number : " + missingNumber);
	}
}
