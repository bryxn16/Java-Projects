package help;
import java.util.Scanner;
public class MethodThree {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int fn = input.nextInt();
		System.out.println("Enter Second number: ");
		int sn = input.nextInt();
		
		int max = find_max_return(fn,sn); //method calling
		int min = find_min_return(fn,sn); //method calling
		
		int range = max-min;
		
		int rangeMethod = find_range(max,min);
		
		System.out.println("Difference: " + range);
		System.out.println("Difference uing method: " + rangeMethod);

		input.close();
	}
	public static int find_range(int a, int b)
	{
		return(a-b);
	}
	public static int find_max_return(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}	
	public static int find_min_return(int a, int b)
	{
		int m=0;
		if(a<b)
			m=a;
		else
			m=b;
		return m;
	}

}//class end
