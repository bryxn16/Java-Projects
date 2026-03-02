package week5labs;

public class NestedForLoop_wed {

	public static void main(String[] args)
	{
		final int ROW = 12;
		final int COL = 12;
		
		for(int r=1; r<=ROW; r++) //outer loop for rows
		{
			for(int c=1; c<=COL; c++) //inner loop for col c<=COL for rect, c<=r for triangle
			{
				System.out.print( "*" + " ");   //the r*c turns the stars into a number grid (r*c + "*" + " ");
			}
			System.out.println();
		}
	}

}
