package shapeP;

public class Rectangle extends Shape {

	private double width;
	private double height;
	
	public Rectangle(int x, int y) 
	{
		this.width=x;
		this.height=y;
	}

	public void showData()
	{
		super.area= width*height;
		super.perimeter= 2*(width+height);
		
		System.out.println("Rectangle x, y ("+this.width+","+this.height+") ");
		System.out.println("Area : "+ super.area);
		System.out.println("Perimeter : "+super.perimeter);
		System.out.println();
		
	}

}
