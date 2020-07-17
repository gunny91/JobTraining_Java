package mypackage.sports;

public class BaseBall extends Sports{

	private double hitrate;
	
	public BaseBall(String nameOfComp, int entry) {
		super(nameOfComp, entry);
		
	}

	public BaseBall(String name, int entry, double hitrate) {
		super(name, entry);
		this.hitrate = hitrate;
		
	}

	public String toString()
	{
		String result= super.toString();
		result+="Hitting rate : "+this.hitrate +"\n";
		return result;
		
	}

	
	
}
