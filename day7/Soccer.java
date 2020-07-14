package pkg07;

public class Soccer extends Sports{

	
	private int goal;
	
	
	/**
	 * Soccer constructor that initiate the name, member and goal;
	 * @param name
	 * @param member
	 * @param goal
	 */
	public Soccer(String name, int member, int goal) {
		super(name, member);
//		super.setName(name);
//		super.setMembers(member);
		this.goal = goal;
	}

	public void showSoccer()
	{
		super.showInfo();
		System.out.println("Goal score : "+this.goal);
		System.out.println();
		
	}
	
}
