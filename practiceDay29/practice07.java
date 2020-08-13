package practiceDay29;

public class practice07 {

	public static void main(String[] args) {
		//x, y integer  get 2x + 4y =10; 0 <=10 
		
//		for(int x = 0 ; x <=10; x++)
//		{
//			for(int y =0; y<=10; y++)
//			{
//				if((2*x+4*y)==10)
//				{
//					System.out.println("x Value : "+x+ " Y value : "+y);
//				}
//			}
//			
//		}

		int temp=1234567;
		
		  int  n, sum = 0;
		for(int x = 1 ; x <=7; x++)
		{
			
		
             sum += temp % 10;
             System.out.println(temp= temp / 10);
            
//            sum +=num%10;
//            num/10;
		}
		System.out.println(sum);
			
//		sum =0;
//		
//		  for (sum = 0; temp > 0; sum += temp % 10,temp /= 10) 
//		  {System.out.println(sum);}
		  			
			
//			if(temp %10==0) System.out.println(temp);
		
			
		
		
		
		
	}

}
