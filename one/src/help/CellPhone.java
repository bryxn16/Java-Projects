package help;
public class CellPhone 
{
	private String manufact;
	private String model;
	private double retailPrice;
	
	//overloaded constructor (HAS ARUGUMENTS)
	public CellPhone(String newMan, String newMod, double newPrice)
	{
		manufact = newMan;
		model = newMod;
		retailPrice = newPrice;
	}
	
	//start of ACCESSORS: setters
	public void setManufact(String man)
	{
		manufact = man;
	}//end of setManufact
	public void setModel(String mod)
	{
		model = mod;
	}
	public void setretailPrice(double price)
	{
		retailPrice = price;
	}
	
	//start of MUTATORS: getters
	public String getManufact()
	{
		return manufact;
	}//end of getManufact
	public String getModel()
	{
		return model;
	}//end of getModel
	public double getretailPrice()
	{
		return retailPrice;
	}//end of getretailPrice
	
	public void displayCellPhone(CellPhone c)
	{
		System.out.println("Manufacturer: " + manufact);
		System.out.println("Model: " + model);
		System.out.println("Retail Price $" + retailPrice);
	}
}//end of class
