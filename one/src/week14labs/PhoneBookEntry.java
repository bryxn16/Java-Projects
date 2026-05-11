package week14labs;

public class PhoneBookEntry 
{
	private String name;
	private String phNum;
	
	public PhoneBookEntry()
	{
		name = " ";
		phNum = " ";
	}
	public PhoneBookEntry(String newN, String newPh)
	{
		name = newN;
		phNum = newPh;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	public String getPhNum()
	{
		return phNum;
	}
	
	//setter
	public void setName(String newName)
	{
		name = newName;
	}
	public void setPhoneNum(String newPhoneNum)
	{
		phNum = newPhoneNum;
	}
	
	
	
}
