package help;
import java.util.Scanner; //step 1
public class MethodOne {
public static Scanner input = new Scanner(System.in); // EXAM 2 this is put up here so all the other public methods can read the scanner input

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

}
