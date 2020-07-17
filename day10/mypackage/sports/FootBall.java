package mypackage.sports;

public class FootBall extends Sports {
	
	private int goal;
	
	public FootBall(String nameOfComp, int entery, int goal) {
		super(nameOfComp, entery);
		this.goal =goal;
	}
	
	public String toString()
	{
		String result=super.toString();
		result+="Goal Count : "+this.goal;
		return result;
		
	}
	


	
}
