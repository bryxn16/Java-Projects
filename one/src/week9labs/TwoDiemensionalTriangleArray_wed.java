package week9labs;

public class TwoDiemensionalTriangleArray_wed 
{

	public static void main(String[] args) 
	{
		final int SIZE = 6;
		
		char [][]arr = new char[SIZE][SIZE];
		
		//store * in array
		for(int r=0; r<SIZE; r++)
		{
			for(int c=0; c<SIZE; c++)
			{
				arr[r][c] = "*";
			}
		}
		
		//print
		for(int r=0; r<SIZE; r++)
		{
			for(int c=0; c<SIZE; c++)
			{
				System.out.println(arr[r][c] + " ");
			}
		}
		
		
		
		
		
		
	}//end of main

}//end of class
