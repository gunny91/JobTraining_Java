package pkg11;

public class LessThan5 extends Exception{

	//inheritate Exception class example
	//use the throw generate the object
	//use try...catch 
	
	//throw : user intend to make exception
	
	private String message;
	
	public LessThan5(String message)
	{
		super(message);
		this.message =message;
	}
	
	@Override
	public String toString()
	{
		return "Overriding"+this.message;
	}

}
