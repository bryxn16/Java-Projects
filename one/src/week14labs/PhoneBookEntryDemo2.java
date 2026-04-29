package week14labs;
import java.util.ArrayList;
public class PhoneBookEntryDemo2 {

	public static void main(String[] args) 
	{
		//creating the arraylist
		ArrayList<PhoneBookEntry> myList = new ArrayList<>();   //this is an integer arraylist but with an object inside it
		String name = "Bryan Guzman";
		String phoneNumber = "5622968067";
		
		
		PhoneBookEntry entry = new PhoneBookEntry(name, phoneNumber); //this is the .add part to your array but with an object
		myList.add(entry);
		
		System.out.println("\nDisplay these information");
		System.out.println(entry.getName());
		
		
		
		
	}

}
