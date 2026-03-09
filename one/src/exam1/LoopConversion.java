package exam1;

public class LoopConversion {

	public static void main(String[] args)
	{
		/*
		int count = 0;
		while(count < 50)
		{
			System.out.println("Count is " + count);		//unmodified while loop
			count++;
		}
		*/
		for(int count = 0; count < 50; count++)
		{
			System.out.println("Count is " + count);		// modified from while loop to for loop 
		}
		
		System.out.println("-----------------------------------------------");
		
		/*
		for(int x = 50; x > 0; x--)
		{
			System.out.println(x + " seconds to go.");				//unmodified for loop
		}
		*/
		
		int x = 50;
		while(x > 0)
		{
			System.out.println(x + " seconds to go.");		//modified from for loop to while loop
			x--;
		}
		
	}

}
