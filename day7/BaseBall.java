package pkg07;

public class BaseBall extends Sports{

	private double hittingrate;
	
	
	/**
	 * Constructor that initiate the baseball name, member, and hitting rate
	 * @param name
	 * @param member
	 * @param hittingrate
	 */
	public BaseBall(String name, int member, int hittingrate) {
	
		super(name, member);
//		super.setName(name);
//		super.setMembers(member);
		this.hittingrate = hittingrate;
		
	}

	public void showBaseBall()
	{
		super.showInfo();
		System.out.println("Goal rate : "+this.hittingrate);
		System.out.println();
	}
}
