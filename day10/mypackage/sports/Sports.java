package mypackage.sports;

public abstract class Sports {
	private String name;
	private int entry;
	
	public Sports(String nameOfComp, int entry) {
		this.name = nameOfComp;
		this.entry= entry;
	}

	public void playGame() {
		
		
	}
	
	@Override
	public String toString()
	{
		String result="===Favorite Sport Info===\n";
		result+= "Name of game : "+this.name+"\n";
		result+= "Entry : " + this.entry +"\n";
		
		return result;
		
	}

}
