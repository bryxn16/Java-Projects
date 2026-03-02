package week4labs;
import java.util.Scanner;
public class WhileForLoop_wed {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) //this counts from 1 to 10
		{
			System.out.print(i + " ");
		}
		for(int i=10; i>=1; i--) //this counts from 10 to 1
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=5; i<=49; i++) //starts counting at 5 and ends at 49
		{
			if(i%2 == 1) //this code can output every odd or even number
			System.out.print(i + " ");
		}
		
		System.out.println();

		for(int i=5; i<=49; i++) //starts counting at 5 and ends at 49
		{
			if(i%5 == 0) //this code can output every multiple of 5
			System.out.print(i + " ");
		}
		
		System.out.println();

		for(int i=0; i<=100; i=i+5) //displays every 5th number from 0 to 100
		{
			System.out.print(i + " ");
		}
		
		input.close();
	}

}
