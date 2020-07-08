package pkg01;

public class Practice1 {

	public static void main(String[] args) {
		int width =10 ;
		int height =4;
		
		int temp = (width * height) /2;
		
		System.out.printf("³ÐÀÌ »ï°¢Çü: %d",temp);
		
		
		int half = 10;
		float anotherTemp = (float) (Math.PI*half*half);
		
		System.out.printf("\n¿øÀÇ ³ÐÀÌ: %.2f",anotherTemp);
		
		Practice1 p = new Practice1();
		System.out.println(p.getResult(10));
		System.out.println(p.getTriangle(4, 5));
	}

	String getResult (int half)
	{
		
		return "\nThe result is "+((float) Math.PI*half*half);
	}
	
	String getTriangle (int width, int height)
	{
		return "The Triangle's area is " + width*height/2;
	}
}
