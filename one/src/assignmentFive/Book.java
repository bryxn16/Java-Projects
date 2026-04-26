package assignmentFive;

public class Book
{
	private String title;
	
	private String author;
	
	private String publisher;
	
	private int copiesSold;
	
	//constructor
	public Book(String t, String a, String p, int cS)
	{
		title = t;
		author = a;
		publisher = p;
		copiesSold = cS;
	}//end of book
	
	//start of ACCESSORS : getters
	public  String getTitle()
	{
		return title;
	}//end of getTitle
	public  String getAuthor()
	{
		return author;
	}//end of getAuthor
	public  String getPublisher()
	{
		return publisher;
	}//end of getPublisher
	public  int getCopiesSold()
	{
		return copiesSold;
	}//end of getCopiesSold

	
	//start of MUTATORS : setters
	public void setTitle(String t)
	{
		title = t;
	}//end of setTitle
	public void setAuthor(String a)
	{
		author = a;
	}//end of setAuthor
	public void setPublisher(String p)
	{
		publisher = p;
	}//end of setPublisher
	public void setCopiesSold(int cS)
	{
		copiesSold = cS;
	}//end of SetCopiesSold
}//end of class
