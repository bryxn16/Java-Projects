package week12labs;
import java.util.Scanner;
public class PetDemo {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Pet myPet = new Pet("Micky", "Dog", 12);
		
		Pet yourPet = new Pet(); //default constructor
		
		System.out.println("What type of pet do you have: ");
		String type = input.next();
		
		System.out.println("What is the name of your pet: ");
		String petName = input.next();
		
		System.out.println("How old is your pet(in whole years): ");
		int petAge = input.nextInt();
		
		yourPet.setAnimal(type);
		yourPet.setName(petName);
		yourPet.setAge(petAge);
		
		System.out.println("My pet information...");
		myPet.showPet();
		
		System.out.println("\nYour pet information...");
		yourPet.showPet();
		
		//compare
		myPet.compare(yourPet);
		
		
		
		
		
		input.close();
	}

}
