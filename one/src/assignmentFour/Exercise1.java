package assignmentFour;
import java.util.Scanner;
public class Exercise1 {
public static Scanner input = new Scanner(System.in);
public static int O_pos = 0;
public static int O_neg = 0;
public static int A_pos = 0;
public static int A_neg = 0;
public static int B_pos = 0;
public static int B_neg = 0;
public static int AB_pos = 0;
public static int AB_neg = 0;
	public static void main(String[] args) 
	{
		int choice = 0;
		do
		{
			System.out.println("\nEnter the number that correlates with you-> ");
			System.out.println("1: if you are admin ");
			System.out.println("2: if you are donor");
			System.out.println("3: if you are a patient");
			System.out.println("4: if you want to exit");

			System.out.print("Enter your choice: ");
			choice = input.nextInt();
			if(choice == 1)
			{
				admin();
			}
			else if(choice == 2)
			{
				donor();
			}
			else if(choice == 3)
			{
				patient();
			}
			else
			{
				System.out.println("Exiting...");
			}
		}while (choice != 4);
			System.out.println("Thanks for using this program");
		input.close();
	}//end of main
	public static void admin()
	{
		System.out.println("Welcome Admin!!!");
		System.out.print("Enter password: ");
		String password = input.next();
		
		if(password.equals("guzman"))
		{
			System.out.println("Welcome Admin!!!");
			showBlood();
		}
		else
		{
			System.out.println("Wrong password");
		}

	}//end of admin
	public static void donor()
	{
		System.out.println("Welcome Donor!!!");
		System.out.println("**Enter your information.**");
		
		System.out.println("\nEnter your name: ");
		String name = input.next();
		
		System.out.println("Enter your gender: ");
		String gender = input.next();
		
		System.out.println("O+ = O Positive Blood Group");
		System.out.println("O- = O Negative Blood Group");
		System.out.println("A+ = A Positive Blood Group");
		System.out.println("A- = A Negative Blood Group");
		System.out.println("B+ = B Positive Blood Group");
		System.out.println("B- = B Negative Blood Group");
		System.out.println("AB+ = AB Positive Blood Group");
		System.out.println("AB- = AB Negative Blood Group");
		
		System.out.println("Pick your blood type: ");
		String bloodtype = input.next();
		
		System.out.println("How many packets are you donating: ");
		int numpackets = input.nextInt();
		
		if(bloodtype.equals("O+"))
		{
			O_pos += numpackets;
		}
		else if(bloodtype.equals("O-"))
		{
			O_neg += numpackets;
		}
		else if(bloodtype.equals("A+"))
		{
			A_pos += numpackets;
		}
		else if(bloodtype.equals("A-"))
		{
			A_neg += numpackets;
		}
		else if(bloodtype.equals("B+"))
		{
			B_pos += numpackets;
		}
		else if(bloodtype.equals("B-"))
		{
			B_neg += numpackets;
		}
		else if(bloodtype.equals("AB+"))
		{
			AB_pos += numpackets;
		}
		else if(bloodtype.equals("AB-"))
		{
			AB_neg += numpackets;
		}
		
		System.out.println("Do you want your information to be displayed now (Y/N): ");
		char infoDisplayed = input.next().charAt(0);
		
		if(infoDisplayed == 'Y')
		{
			System.out.println("Your name: " + name);
			System.out.println("Your gender: " + gender);
			System.out.println("Your blood group: " + bloodtype);
			System.out.println("Packets of donated blood : " + numpackets);
		}
		else
		{
			System.out.println("No Problem :)");
		}
		
		
		
		
		
	}//end of donor
	public static void patient()
	{
		System.out.println("Welcome Patient!!!");
	}//end of patient
	public static void showBlood()
	{
		System.out.println("***Currently we have this many blood packets in stock***");
		System.out.println("O+: " + O_pos);
		System.out.println("O-: " + O_neg);
		System.out.println("A+: " + A_pos);
		System.out.println("A-: " + A_neg);
		System.out.println("B+: " + B_pos);
		System.out.println("B-: " + B_neg);
		System.out.println("AB+: " + AB_pos);
		System.out.println("AB-: " + AB_neg);
	}//end of showBlood
	

}//end of class
