package practice;

public class Rectangle {

	private int width;
	private int height;
	private int result;
	
	public Rectangle(int x, int y)
	{
		this.width =x;
		this.height =y;
		result =0;
	}
	
	public int area()
	{	
		return result = width*height;
	}
	
	public int perimiter()
	{
		return 2*width+2*height;
	}
	
	public void result()
	{
		if(result> 300)
		{
			System.out.println("Hight class");
		}
		else if(result > 200 )
		{
			System.out.println("Middle class");
		}else
			System.out.println("Small class");
	}
	
	
	
	
}
