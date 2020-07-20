package pkg11;

public class GirlException extends Exception {

	private String message;
	
	public GirlException(String message)
	{
		System.out.println("Constructor called");
		this.message =message;
	}
	
	
	/**
	 * 
	 * If getLocalizedMessage returns null, 
	 * then justthe class name is returned.
	 * Overrides: toString() in Throwable
	 * 
	 * Object = Throwable -Exception - lower exception
	 * 					  -Error
	 * Throwable is Overried from Object's toString() method
	 * 
	 */
	@Override
	public String toString() {
		return "String : "+this.message;
	}
	
	/**
	 * 
	 *	 Overrides: getMessage() in Throwable
	 *	Returns:the detail message string of 
	 *	this Throwable instance(which may be null).
	 * 
	 * 
	 */
	@Override
	public String getMessage()
	{
		return "Message Context : "+this.message;
	}
	
	
	
}
