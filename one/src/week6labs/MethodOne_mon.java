package week6labs;
import java.util.Scanner; //step 1
public class MethodOne_mon {
public static Scanner input = new Scanner(System.in); //step 2
	public static void main(String[] args) 
	{
		System.out.println("\n***User Information***");
		for(int i=3; i<=3; i++)
		{
			MyInformation();
		}
		input.close(); //step 3
	}//end of main
	public static void MyInformation()
	{
		System.out.print("Name: ");
		String name = input.nextLine();
		
		System.out.print("GPA: ");
		double gpa = input.nextDouble();
		
		System.out.print("Age: ");
		int age = input.nextInt();
		
		System.out.println("Grade in the class: ");
		char grade = input.next().charAt(0);
		
		System.out.println("Name: " + name);
		System.out.println("GPA: " + gpa);
		System.out.println("Age: " + age);
		System.out.println("Grade: " + grade);
	}
	public static void YourInformation()
	{
		System.out.println("\n***Your Information***");
		System.out.println("Name: Bryan Guzman");
		System.out.println("GPA: 3.5");
		System.out.println("Age: 20");
		System.out.println("Grade: A");
	}
}//end of class
