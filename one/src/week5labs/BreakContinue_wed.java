package week5labs;
import java.util.Scanner; //step 1
public class BreakContinue_wed {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); // step2
		
		for(int i=1; i<=20; i++)
		{
			if(i==13)
				continue;
			if(i==10)
				break;
			System.out.print(i + " ");
		}
		
		System.out.println("\nThank you for using this program");
				
		input.close();
	}

}
