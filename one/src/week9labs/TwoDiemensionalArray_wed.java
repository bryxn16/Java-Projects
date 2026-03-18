package week9labs;

public class TwoDiemensionalArray_wed 
{

	public static void main(String[] args) 
	{
		int [][] marks= {{50, 60, 78, 87, 95}, {98, 87, 75, 76, 99}, {98, 99, 97, 95, 100}};
		
		int rowLength = marks.length;
		int colLength = marks[0].length;
		
		System.out.println("Row length: " + rowLength);
		System.out.println("Col length: " + colLength);

		//print the 2d array now
		for(int r=0; r<rowLength; r++)
		{
			for(int c=0; c<colLength; c++)
			{
				System.out.print(marks[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println("\nPrinting again...");
		printArray(marks);
	}//main
	public static void printArray(int [][]a)
	{
		int rowLength = a.length;
		int colLength = a[0].length;
		
		System.out.println("Row length: " + rowLength);
		System.out.println("Col length: " + colLength);

		//print the 2d array now
		for(int r=0; r<rowLength; r++)
		{
			for(int c=0; c<colLength; c++)
			{
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

}//class
