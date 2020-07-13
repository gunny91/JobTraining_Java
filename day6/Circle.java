package pkg06;

/**
 * This is the class to practice of Java programming
 * @author Geonhee Cho
 *
 */
public class Circle {

	//x, y half length
	//permit
	//area
	

	private double xCor;
	private double yCor;
	private double radius;
	private double perimeter ;
	private double area; //Area should not be entered!!!
	private String status;
	/**
	 * This is the constructor to initiate the values
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param radiusradius
	 */
	public Circle(double x, double y, double radius)
	{
		this.xCor = x;
		this.yCor = y;
		this.radius =radius;
	}
	
	/**
	 * 2 ¡¤ ¥ğ ¡¤ R This is the method to get the perimeter of circle
	 * @return perimeter
	 */
	public double getPerimeter()
	{
		return (2*Math.PI*this.radius);
	}
	
	/**
	 * This is the method to get the Area
	 * @return area of circle
	 */
	public double getArea()
	{
		return (Math.pow(this.radius, 2)*Math.PI);
	}
	
	/**
	 * This is void method to display the result
	 */
	public void display()
	{
		System.out.println("Center of Circle : "+ this.xCor + ", "+ this.yCor);
		System.out.println("Radius : "+ this.radius);
		System.out.printf("Perimeter : %.2f\n", getPerimeter());
		//area = Math.pow(this.radius, 2)*Math.PI;
		//perimeter = 2*PI*R
		System.out.printf("Area : %.2f\n",getArea());
		System.out.println(getStatus());
		//System.out.println("--------------------------------");
		
		
	
	}

	public String getStatus() {

		if(getArea()>500)
		{
			status ="State : Giant";
		}
		else
			status ="State : Small";
		
		return status;
	}
}
