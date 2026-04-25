package assignmentFive;

public class Book
{
	private String title;
	
	private String author;
	
	private String publisher;
	
	private int copiesSold;
	
	//constructor
	public Book(String title, String author, String publisher, int copiesSold)
	{
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.copiesSold = copiesSold;
	}//end of book
	
	//start of ACCESSORS : getters
	public  String getTitle()
	{
		return title;
	}//endn of getTitle
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
	public void setTitle(String title)
	{
		this.title = title;
	}//end of setTitle
	public void setAuthor(String author)
	{
		this.author = author;
	}//end of setAuthor
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}//end of setPublisher
	public void setCopiesSold(int copiesSold)
	{
		this.copiesSold = copiesSold;
	}//end of SetCopiesSold
	
	
	
	
	
	
	
}
