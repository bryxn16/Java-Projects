package week3labs;
import java.util.Scanner; //1
public class Exercise1_mon {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //2
		
		System.out.println("Enter your full name: ");
		String name = input.nextLine(); //multiple words
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		System.out.println("Enter your grade: ");
		//String grade = input.next(); //single WORD
		char grade = input.next().charAt(0); //single LETTER
		
		System.out.println("Enter your income: ");
		double income = input.nextDouble();
		
		System.out.println("Enter your bonus");
		double bonus = input.nextDouble();
		
		double total = income + bonus;
		
		System.out.println("Your name: " + name);
		System.out.println("Your age: " + age);
		System.out.println("Your grade: " + grade);
		System.out.println("Your income: " + total);

		input.close();//3
	}

}
