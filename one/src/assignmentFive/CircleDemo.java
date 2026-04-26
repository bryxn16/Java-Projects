package assignmentFive;
import java.util.Scanner;
public class CircleDemo {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius for the circle: ");
		double r = input.nextDouble();
		
		Circle yourCircle = new Circle(r);
		
		System.out.println("Area: " + yourCircle.getArea());
		System.out.println("Diameter: "+ yourCircle.getDiameter());
		System.out.println("Circumference: "+ yourCircle.getCircumference());

		input.close();
	}//end of main
}//end of class
