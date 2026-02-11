package week3labs;
import java.util.Scanner; //step 1
public class SmallestNum_wed {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //step 2
		
		System.out.println("Enter your first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter your second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter your third number: ");
		int num3 = input.nextInt();
		
		int small = 0;
		if(num1<num2 && num1<num3)
			small = num1;
		else if(num2<num1 && num2<num3)
			small = num2;
		else
			small = num3;
			
		System.out.println("Smallest number = " + small);
		
		
		
		
		input.close(); //step 3
	}

}
