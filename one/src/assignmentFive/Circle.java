package assignmentFive;

public class Circle 
{
	private double radius;
	private final double PI = 3.14159;
	
	//constructor
	public Circle(double r)
	{
		radius = r;
	}
	public Circle()
	{
		radius = 0;
	}
	
	//getters
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		//area
		return PI*radius*radius;
	}
	public double getDiameter()
	{
		//diameter
		return radius*2;
	}	
	public double getCircumference()
	{
		//circumference
		return 2*PI*radius;
	}
	//setter
	public void setRadius(double r)
	{
		radius = r;
	}
}//end of class
