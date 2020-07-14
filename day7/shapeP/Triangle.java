package shapeP;

public class Triangle extends Shape{
	private double x;
	private double y;
	
	
	public Triangle(double d, double e) {
		
		x =d;
		y =e;
	}
	
	public void showDatA() {
		super.area= x*y/2;
		super.perimeter= x+y+Math.sqrt(x*x+y*y);
		
		System.out.println("Triangle's x, y ("+this.x+","+this.y+") ");
		System.out.println("Area : "+ super.area);
		System.out.println("Perimeter : "+super.perimeter);
		System.out.println();
		
	}

}
