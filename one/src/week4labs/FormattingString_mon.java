package week4labs;

public class FormattingString_mon {

	public static void main(String[] args) 
	{
		double num1 = 3465.148; //2 decimal points
		double num2 = 1.2345;
		
		System.out.printf("$ %010.2f\n", num1); //the 0 in front adds the zeros, the 10 makes it go to the left
		System.out.printf("$ %010.2f\n", num2);
		
		int n = 123456;
		System.out.printf("%,d", n);
		
		
	}

}
