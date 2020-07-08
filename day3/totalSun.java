package pkg03;

public class totalSun {

	public static void main(String[] args) {
		
		//1+1/2+....+1/100
		
		float total =0;
		for(float i =1; i <=100; i++)
		{
			total+= (1/i);
		}
		System.out.println(total);
		
		
		float x =1;
		float totalSum =0;
		
		while(x<=100)
		{
			totalSum += (1/x);
			x++;
		}
		
		System.out.println(totalSum);
		
		
		
	}

}
