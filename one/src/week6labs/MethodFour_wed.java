package week6labs;
import java.util.Scanner;
public class MethodFour_wed {
public static Scanner input = new Scanner(System.in); // EXAM 2 this is put up here so all the other public methods can read the scanner input
	public static void main(String[] args) 
	{
		System.out.println("Enter the length of rectangle: ");
		System.out.println("Enter the width of rectangle: ");

		double length = getSide();
		double width = getSide();
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + (length*width));
		if(isDivisible(length))
			System.out.println("Length of rectangle is a multple of 2");
		else
			System.out.println("Length of rectangle is NOT a multple of 2");

		input.close();
	}//end of main
	public static boolean isDivisible(double d)
	{
		boolean status = true;
		if(d%2==0)
			status=true;
		else
			status=false;
		return status;
	}
	public static double getSide()
	{
		double side = input.nextDouble();
		while(side<=0)
		{
			System.out.println("Must be greater than zero, enter again");
			side = input.nextDouble();
		}
		return side;
	}
}//end of class