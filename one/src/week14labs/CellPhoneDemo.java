package week14labs;
import java.util.Scanner;
public class CellPhoneDemo {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the manufacturer: ");
		String manufacturer = input.nextLine();
		
		System.out.println("Enter the model: ");
		String model = input.nextLine();
		
		System.out.println("Enter the retail price: ");
		double price = input.nextInt();
		
		CellPhone cp = new CellPhone(manufacturer, model, price); 
		
		System.out.println("\nHere is the data that you provided:");
		System.out.println("Manufacturer: " + cp.getManufact());
		System.out.println("Model: " + cp.getModel());
		System.out.println("Retail Price $" + cp.getretailPrice());

		System.out.println("What is the new price of your phone:");
		price = input.nextInt();
		
		cp.getretailPrice();
		
		System.out.println("\nHere is the NEW data that you provided:");
		cp.displayCellPhone(cp);
		
		input.close();
	}
}
