package pkg13;

public class Ningen {

	private String name;
	private String address;
	
	public Ningen(String name, String addr) {
		this.name = name;
		address =addr;
		
	}

	public String getName()
	{
		return name;
	}
	
	public String getAddr()
	{
		return address;
	}
	
	public String toString()
	{
		String temp =getName()+"/"+getAddr();
		return temp;
	}
}
