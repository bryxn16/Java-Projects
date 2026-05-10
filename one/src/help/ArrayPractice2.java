package help;
public class ArrayPractice2 {

	public static void main(String[] args)
	{
		int [] myArray = {25,14,56,15,36}; //checking if its even or odd in array
		
		int [] evenArray = new int[myArray.length];
		int [] oddArray = new int[myArray.length];
		
		int oddNum = 0;
		int evenNum = 0;
		
		for(int i=0; i<myArray.length; i++)
		{
			if(myArray[i] % 2 == 0)
			{
				evenArray[evenNum] = myArray[i];
				evenNum++;
			}
			else if(myArray[i] % 2 != 0)
			{
				oddArray[oddNum] = myArray[i];
				oddNum++;
			}
		}
		System.out.println("***Even Array***");
		for(int i=0; i<evenNum; i++)
		{
			System.out.print(evenArray[i] + ", ");   //prints even array numbers
		}
		System.out.println("\n***Odd Array***");
		for(int i=0; i<oddNum; i++)
		{
			System.out.print(oddArray[i] + ", ");  //prints odd array numbers
		}		
	}
}
