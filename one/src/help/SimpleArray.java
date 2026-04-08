package help;
public class SimpleArray {

	public static void main(String[] args) 
	{
		int []  myArray = {10, 55, 63, 17, 22, 68, 89, 97, 89, 999}; 
		
		int length = myArray.length;  
		System.out.println("Length = " + length);
		
		//prints the array elements
		System.out.println("Prints array forwards  ");
		for(int i=0; i<length; i++)
		{
			System.out.print(myArray[i] + ", ");
		}
		System.out.println("\n\nPrints array backwards  ");
		for(int i=length-1; i>=0; i--)
		{
			System.out.print(myArray[i] + ", ");
		}
		//enhanced for loop
		System.out.println("\n\nEnhanced for loop  ");
		int count = 0;
		for(int n: myArray)
		{
			System.out.print(n + "  ");
			count++;
		}
		System.out.println("\n\nTotal elements: " + count);

		//display element at index number 4
		System.out.println(myArray[4]);
		System.out.println("First element of array: " + myArray[0]);
		System.out.println("Last element of array: " + myArray[length-1]);
		System.out.println("4th element of array: " + myArray[3]);
		//incrementing the 4th element by 1
		System.out.println("4th element of array +1: " + (myArray[3]+1));
		System.out.println("4th element of array +1: " + (++myArray[3]));
		System.out.println("last element of array -10: " + (myArray[length-1]-10));

	}

}
