package week8labs;

public class CopyArray_wed {

	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		
		int size = a.length;
		int []newArray = new int[size];
				
		for(int i=0; i<size; i++)
		{
			newArray [i] = a[i];
		}
		System.out.println("\nprint the old array");
		for(int i1=0; i1<size; i1++)
		{
			System.out.println(a[i1] + " ");
		}
		System.out.println("\nprint the new array");
		for(int i1=0; i1<size; i1++)
		{
			System.out.println(newArray[i1] + " ");
		}
		showSum(newArray);
		
 
	}//end of main	
	public static void showSum(int []arr)
	{
		int len = arr.length;
		int total = 0;
		for(int i=0; i<len; i++)
		{
			total = total + arr[i];
		}
	}
	
	
	
	public static void printArray(int []arr, int len)
	{
		for(int i=0; i<len; i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		
	}
}//end of class
