package pkg07;

public class Circle extends Shape {

	
	private double area;
	private double perimeter;
	private double r;
	
	
	public Circle(String name, int x, int y) {
		super(name,x,y);
		r = Math.sqrt(x*x+y*y);
		area = Math.PI*r;
		perimeter= 2*Math.PI*r;
	}

	

	public void showCircle()
	{
		System.out.println(" ("+super.setXPoint()+", "+super.setYPoint()+")");
		System.out.printf("Area: %.3f\n",area);
		System.out.printf("Perimeter: %.3f\n",perimeter);

	}
	
	
	
	
}
