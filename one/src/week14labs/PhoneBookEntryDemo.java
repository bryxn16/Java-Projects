package week14labs;
import java.util.Scanner;
public class PhoneBookEntryDemo {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		PhoneBookEntry person = new PhoneBookEntry();// this is the object 

		System.out.println("Enter person 1 name: ");
		String name = input.nextLine();
		
		System.out.println("Enter their phone number: ");
		String phoneNumber = input.nextLine();
		
		person.setName(name);    
		person.setPhoneNum(phoneNumber);
		
		System.out.println("\nHere's the data you entered... ");
		System.out.println(person.getName());
		System.out.println(person.getPhNum());
		
		
		//for the second person-----------------------------------------------------------------
		System.out.println("Enter person 2 name: ");
		name = input.nextLine();
		
		System.out.println("Enter their phone number: ");
		phoneNumber = input.nextLine();
		
		PhoneBookEntry person2 = new PhoneBookEntry(name, phoneNumber); // object
		System.out.println(person2.getName());
		System.out.println(person2.getPhNum());
		
		input.close();
	}

}
