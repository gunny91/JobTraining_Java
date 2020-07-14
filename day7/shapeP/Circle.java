package shapeP;

public class Circle extends Shape {
	private double x;
	private double y;
	private double radius;
	
	
	public Circle(double x, double y, double z) {
			this.x =x;
			this.y =y;
			this.radius = z;	
	}


	public void showData() {
		super.area= Math.PI*Math.pow(radius, 2);
		super.perimeter= 2*(Math.PI*radius);
		
		System.out.println("Circle's x, y ("+this.x+","+this.y+") ");
		System.out.println("Area : "+ super.area);
		System.out.println("Perimeter : "+super.perimeter);
		System.out.println();
	}

}
