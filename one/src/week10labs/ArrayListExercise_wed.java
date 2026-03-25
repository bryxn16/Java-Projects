package week10labs;
import java.util.ArrayList;// 1st step
public class ArrayListExercise_wed {

	public static void main(String[] args) 
	{
		//create an array list
		ArrayList <String> nameList = new ArrayList<String>();
		
		//add the names
		nameList.add("Denise");
		nameList.add("Nathan");
		nameList.add("Kevin");
		nameList.add("Michael");
		
		int num = nameList.size();
		System.out.println("Number of people: " + num);
		
		for(int i = 0; i<num; i++)
		{
			System.out.print(nameList.get(i) + " ");
		}
		
		System.out.println("\n\n-------------------Print the Array List not using size-------------------");
		for(String name: nameList)
		{
			System.out.print(name + " ");
		}
	
		System.out.println("\n\n-------------------Print the best friend name, who is first in the list-------------------");
		System.out.println(nameList.get(0)); //two ways to get the first in the list
		System.out.print(nameList.getFirst());

		System.out.println("\n\n-------------------remove the best friend which is first name-------------------");
		System.out.println(nameList); //toString method
		nameList.remove(0);
		System.out.println("New number of people: " + nameList.size());
		System.out.println(nameList);
		
		System.out.println("\n\n-------------------add a friend to last index-------------------");
		nameList.add("Bryann");
		System.out.println(nameList);

		System.out.println("\n\n-------------------Replace your second-best friend with a new friend-------------------");
		nameList.set(1,"Oscar");
		System.out.println(nameList);
		
		System.out.println("\n\n-------------------swapping names of the first 2 friends in the list-------------------");
		String temp1 = nameList.get(1);
		String temp2 = nameList.get(3);
		nameList.remove(1);
		nameList.add(1, temp2);
		
		nameList.remove(3);
		nameList.add(3, temp1);
		
		System.out.println(nameList);//print the array list again to display updated version
		
	}//end of main	

}// end of class
