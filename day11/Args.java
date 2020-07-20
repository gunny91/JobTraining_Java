package pkg11;

public class Args {
	int x;
	
	void add(int y)
	{
		y = y+150;
		System.out.println(" 1 " +y);
	}
	
	void add(Args arg)
	{
		x = arg.x+300;
		System.out.println("2 "+arg.x);
	}
}
