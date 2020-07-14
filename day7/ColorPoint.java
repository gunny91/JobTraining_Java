package pkg07;

public class ColorPoint extends PointClass {

	private String color;
	
	public ColorPoint() {
	
	}

	public ColorPoint(int x, int y) 
	{
		super(x, y);	
	}
	

	

	public void colorPrint()
	{
		//super.showPoint();
		System.out.println(this.color);
		//super.showPoint();
		
	}





	public void setColor(String color) {
		this.color = color;
	}
	

}
