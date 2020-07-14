package pkg07;

public class Triangle extends Shape {

	private int area;
	private int perimeter;
	
	
	public Triangle(String name, int x, int y) {
		super(name, x,y);
		area= x*y/2;
		perimeter = (int) (x+y +Math.sqrt(x*x+y*y));
	}
	
	public void showTri()
	{
		System.out.println("width :"+super.setXPoint()+ ", "+ "Height: "+super.setYPoint());
		
		System.out.println("Area: "+area);
		System.out.println("Perimeter: "+perimeter);

	}
	

}
