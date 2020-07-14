package pkg07;

public class Rectangle extends Shape {

	private int area;
	private int perimeter;
	
	public Rectangle(String name,int x, int y) {
		
		super(name, x,y);
		area = x*y;
		perimeter = 2*(x+y);		
	}

	public void showRec()
	{
		System.out.println("Width: "+super.setYPoint()+"  Height :"+super.setXPoint());
		
		System.out.println("Area: "+area);
		System.out.println("Perimeter: "+perimeter);
	}
	
	
	
}
