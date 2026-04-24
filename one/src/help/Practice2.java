package help;

public class Practice2 {

	public static void main(String[] args)
	{
		int [] num  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //finding the max in an array but using it from another method
		
		int length  = num.length;
		
		int result =  find_max(num);
		System.out.print(result);
		
	}//end of main
	
	public static int find_max(int [] num)
	{
		int max = num[0];
		for(int i=0; i<num.length; i++)
		{
			if(num[i]>max)
			{
				max = num[i];
			}
		}
		return max;
	}
}//end of class
