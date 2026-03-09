package exam1;
import java.util.Scanner;
public class FindArea {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of a circle: ");
		double radius = input.nextDouble();
		double pi = 3.14;
		double area = pi*(Math.pow(radius, 2));
		
		System.out.println("Area = " + area);
		System.out.printf("Area up to 2 decimal points = " + "%.2f\n",area);

		input.close();
	}

}
