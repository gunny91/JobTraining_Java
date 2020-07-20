package pkg11;

public class MinScoreException extends Exception {

	private String message;
	public MinScoreException(String message)
	{
		this.message =message;
	}
	
	@Override
	public String toString() {
		return this.message;
	}
	
	@Override
	public String getMessage()
	{
		return this.message;
	}
	
	
	
}
