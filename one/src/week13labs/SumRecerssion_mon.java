package week13labs;

public class SumRecerssion_mon {

	public static void main(String[] args) 
	{
		final int NUM = 10;
		int sum = 0;
		for(int i=0; i<=10; i++)
		{
			sum +=i;
		}
		System.out.println("The sum of all the numbers are: " + sum);
		//call method
		int sM = sumMethod(NUM);
		System.out.println("Sum from method: " + sM);
		
		int sR = sumMethod(NUM);
		System.out.println("Sum from recursion: " + sR);
	}//end of main
	
	public static int sumRecursion(int x)
	{
		if(x>0)
		{
			return(x+sumRecursion (x-1));
		}
		else
			return 0;
	}//end of sumRecursion
	
	public static int sumMethod(int x)
	{
		int sum = 0;
		for(int i=0; i<=x; i++)
		{
			sum +=i;
		}
		//System.out.println("Sum inside method: " + sum);
		return sum;
	}// end of sumMethod
	
	
	
} //end of class
