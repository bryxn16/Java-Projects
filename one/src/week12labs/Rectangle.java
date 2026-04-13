package week12labs;

public class Rectangle 
{
	private double length;
	private double width;
	
	//constructor --default
	public void Rectangle()
	{
		length = 0;
		width = 0;
	}
	
	//overloaded constructor
	public Rectangle(double newL, double newW)
	{
		length = newL;
		width = newW;
	}
	
	//getter - to access the private data for length/width
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}

	//setter
	public void setLength(double newLen) //len
	{
		length = newLen; //replaces the existing data with the new one(newLen)
	}
	public void setWidth(double newWid) //wid
	{
		width = newWid; //replaces the existing data with the new one(newWid) 
	}
	public double getArea()
	{
		return (length * width);
	}
	public double getPerimeter()
	{
		return (2 * (length * width));
	}
	public void printInformation()
	{
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end of class
