package week8labs;

public class ArrayMaxMin_wed {

	public static void main(String[] args) 
	{
		int[] number = {5, 7, 3, 4, 1, 6, 2, -10, 9, 8};
		
		int len = number.length;
		//total of all numbers
		int total = 0;
		for(int i=0; i<len; i++)
		{
			total = total + number[i];  //total+= number[i]
			
		}
		System.out.println("total= " + total);
		System.out.println("----------------------------------");

		//MAX number
		int max = number[0];
		for(int i=0; i<len; i++)
		{
			if(max<number[i])
				max = number[i];
		}
		System.out.println("Maximum number of this array = " + max);

		System.out.println("----------------------------------");

		//MIN number
		int min = number[0];
		for(int i=0; i<len; i++)
		{
			if(min>number[i])
				min = number[i];
		}
		System.out.println("Minimum number of this array = " + min);	
		System.out.println("----------------------------------");
		greater_five(number);
	}//end of main
	
	//Write a method greater_five that accepts array an argument and display those number that are greater than 5 in the array.
	public static void greater_five(int[] number)
	{
		System.out.print("Greater than 5 numbers are = ");
		for(int i=0; i<number.length; i++)
		{
			if(number[i] > 5)
				{
					System.out.print(number[i] + ", ");
				}
		}
	}

}//end of class