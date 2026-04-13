package help;
import java.util.Scanner;
public class MethodTwoNumbers {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //step 2
		System.out.println("Enter your first number: ");
		int fn = input.nextInt();
		System.out.println("Enter your second number: ");
		int sn = input.nextInt();
		
		//calling method
		find_sum(fn,sn);
		find_max(fn,sn);
		
		input.close(); //step 
	}
	public static void find_sum(int a, int b)
	{
		int sum = a+b;
		System.out.println("Sum of these numbers: " + sum);
	}
	public static void find_max(int x, int y)
	{
		if(x>y)
			System.out.println(x + "is bigger number");
		else
			System.out.println(y + "is bigger number");
	}
}//class end
