package help;

public class practice {

	public static void main(String[] args) 
	{
		int [] num = {5,10,15,20,25};
		
		int length = num.length;
		
		for(int i=0; i<length; i++)
		{
			System.out.println(num[i] + ", ");
		}
		
		System.out.println("This is the third element of the array " + "\"" + num[2]+ "\"");
	}//end of main
}//end of class
