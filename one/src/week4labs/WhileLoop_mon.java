package week4labs;
import java.util.Scanner; //step 1
public class WhileLoop_mon {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //step 2
		
		System.out.println("Enter a number greater than 0 and less than or equal to 100: ");
		int num = input.nextInt();
		
		System.out.println("Num = " + num);
		while(num < 1 || num > 100)
		{
			System.out.println("Enter a number greater than 0 and less than or equal to 100: ");
			num = input.nextInt();
		}
		
		input.close(); //step 3
	}

}
