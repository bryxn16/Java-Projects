package week8labs;

public class CompareMove_wed {

	public static void main(String[] args) 
	{
		int[] a = {1, 2, 3, 44, 5, 6, 7};
		int[] b = {1, 2, 3, 4, 5, 6, 7};

		/*
		if(a==b)
			System.out.println("Same");
		else
			System.out.println("NOT Same");
		*/
		
		//right way 
		int lengthA = a.length;
		int lengthB = b.length;
		boolean same = false;
		
		if(lengthA == lengthB)
		{
			for(int i=0; i<lengthA; i++)
			{
				if(a[i] == b[i])
				{
					same = true;
				}
				else
				{
					same = false;
					break;
				}
			}
		}
		
		if(same)
			System.out.println("Same Array");
		else
			System.out.println("NOT Same Array");

	}//end of main

}//end of class
