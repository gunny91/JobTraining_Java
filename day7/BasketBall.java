package pkg07;

public class BasketBall extends Sports{

	private int goal;

	public BasketBall(String name, int member, int goal)
	{
		super(name,member);
		this.goal = goal;
		
	}
	
	public void showBasketBall()
	{
		super.showInfo();
		System.out.println("Goal Score : "+this.goal);
		System.out.println();
	}

}
