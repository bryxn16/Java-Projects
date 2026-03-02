package assignmentTwo;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 strings(in an order): ");
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		String s3 = input.nextLine();
		
		if(s1.compareTo(s2) > 0)
		{
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}
		if(s1.compareTo(s3) > 0)
		{
			String temp = s1;
			s1 = s3;
			s3 = temp;
		}
		if(s2.compareTo(s3) > 0)
		{
			String temp = s2;
			s2 = s3;
			s3 = temp;
		}
		System.out.println("\nIn Lexicographic ordering, the strings you entered are: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	
		input.close();
	}

}
