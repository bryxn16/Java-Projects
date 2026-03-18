package week9labs;

public class ReturnArray 
{

	public static void main(String[] args) 
	{
		double [] newArr = getArray();
		System.out.println ("------Array elements are......");
		printArray(newArr);
	}//end of main
	
	public static void printArray(double []a)
	{
		int len = a.length;
		for(int i=0; i<len; i++)
		{
			System.out.println(a + " ");
		}
	}
	
	public static double[] getArray()
	{
		double [] a = {1.2, 2.3, 4.5, 6.7, 8.9};
		return a;
	}

}//end of class
