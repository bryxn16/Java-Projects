package week14labs;
import java.util.Scanner;
public class MethodOverloading {
public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{			
		System.out.println("Enter your choice: ");
		int choice = getChoice();

		if(choice == 1)
		{
			System.out.println("Enter length");
			double length = input.nextDouble();
			
			System.out.println("Enter width");
			double width = input.nextDouble();
			
			getArea(length, width);
		}
		else if(choice == 2)
		{
			System.out.println("Enter side length of sqaure: ");
			double side = input.nextDouble();
			getArea(side);
		}
		else if(choice == 3)
		{
			System.out.println("Enter base length of triangle: ");
			double base = input.nextDouble();
			System.out.println("Enter height length of triangle: ");
			double height = input.nextDouble();
			getArea(base,height);
		}
		else
			System.out.println("Invalid Choice");
		
		input.close();
	}
	public static int getChoice()
	{
		System.out.println("What do you want to find? ");
		System.out.println("1. Area of rectanlge ");
		System.out.println("2. Area of sqaure ");
		System.out.println("3. Area of triangle ");
		int choice = input.nextInt();
		return choice;

	}
	public static void getArea(double len, double wid)//rectangle
	{
		System.out.println("Area of a rectangle: " + (len*wid));
	}
	public static void getArea(double side)//square
	{
		System.out.println("Area of a sqaure: " + (Math.pow(side, 2)));
	}
	public static void getArea1(double base, double height)//triangle
	{
		System.out.println("Area of a triangle: " + ((0.5)*(base*height)));
	}
}
