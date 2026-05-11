package help;
import java.util.ArrayList;
public class ArrayListExercise {

	public static void main(String[] args) 
	{
		ArrayList <Integer> sum = new ArrayList<Integer>();
		
		sum.add(5);
		sum.add(10);
		sum.add(15);
		sum.add(20);
		
		int size = sum.size();
		int totalSum = 0;
		
		for(int i=0; i<size; i++)
		{
			//sum.get(i);
			totalSum += sum.get(i);
			System.out.println(i);
		}
	}
}
