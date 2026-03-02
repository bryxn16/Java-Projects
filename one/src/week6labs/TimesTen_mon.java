package week6labs;
import java.util.Scanner; //step 1
public class TimesTen_mon {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //step 2
		
		System.out.println("Enter a number: ");
		double num1 = input.nextDouble();
		times_ten(num1);
		
		input.close();	
	}//main
	public static void times_ten(double d)
	{
		System.out.println(d + "times 10" + (d*10));
	}
	
}//close
