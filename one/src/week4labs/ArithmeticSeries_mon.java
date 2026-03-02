package week4labs;


//print a series 3.5, 6.5, 9.5, 12.5...
//print first 10 numbers of this series
public class ArithmeticSeries_mon {

	public static void main(String[] args) 
	{
		double firstNum = 3.5;
		double t = 0;
		for(int i=1; i<=10; i++)
		{
			System.out.println(firstNum + " "); //prints the first number
			t =+ firstNum;
			//^same as t = t + firstNum
			firstNum +=3;
			//^same as firstNum = firstNum + 3
		}
		System.out.println("\ntotal: " +  t);
	}

}
