package pkg07;

public class Shape {

	private int x;
	private int y;
	
	public Shape(String name, int x2, int y2) {
		this.x = x2;
		this.y = y2;
		System.out.println(name);
	}
	

	public int setXPoint()
	{
		return this.x;
	}
	
	public int setYPoint()
	{
		return this.y;
	}
	
	
}
