package week12labs;
import java.util.Scanner;
public class PetDemoArray {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Pet[] manyPets = new Pet[2];
		manyPets[0] = new Pet("Micky", "Dog", 12);
		
		manyPets[1] = new Pet();
		
		System.out.println("What type of pet do you have: ");
		String type = input.next();
		
		System.out.println("What is the name of your pet: ");
		String petName = input.next();
		
		System.out.println("How old is your pet(in whole years): ");
		int petAge = input.nextInt();
		
		manyPets[1].setAnimal(type);
		manyPets[1].setAge(petAge);
		manyPets[1].setName(petName);		
		
		manyPets[0].showPet();
		manyPets[1].showPet();
		manyPets[1].showPet();
	}

}
