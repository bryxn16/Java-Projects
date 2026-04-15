package week12labs;

public class Pet 
{
	private String name;
	private String animal;
	private int age;
	
	//default constructor
	public Pet()
	{
		name = " ";
		animal = " ";
		age = 0;
	}
	//overloaded constructor
	public Pet(String a, String b, int c)
	{
		name = a;
		animal = b;
		age = c;
	}
	//get methods
	public String getName()
	{
		return name;
	}
	public String getAnimal()
	{
		return animal;
	}
	public int getAge()
	{
		return age;
	}
	//set methods
	public void setName(String newName)
	{
		name = newName;
	}
	public void setAnimal(String newAnimal)
	{
		animal = newAnimal;
	}
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	//showPet method
	public void showPet()
	{
		System.out.println("Name: " + name);
		System.out.println("Animal type: " + animal);
		System.out.println("age: " + age);
	}
	//compare method as an argument
	public void compare(Pet p)
	{
		if(this.age == p.age && this.name.equalsIgnoreCase(p.name) && this.animal.equalsIgnoreCase(p.animal))
			System.out.println("\nSame Pet");
		else
			System.out.println("\nDifferent Pet");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
