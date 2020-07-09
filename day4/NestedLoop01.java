package pkg04;

public class NestedLoop01 {

	public static void main(String[] args) 
	{
		int total =0;
		
		
		/**
		 *  1 5 6 7
		 *  
		 * 	2 5 6 7
		 * 
		 * total 
		 * 6
		 * 
		 * 
		 * 
		 */
		
//		for(int i = 1; i <3; i++)
//		{
//			for(int j =5; j< 8;j++)
//			{
//				total+=i+j;
//			}
//		}
//		
//		System.out.println(total);
		
		
		for(int i = 1; i <4; i+=2)
		{
			for(int j =2; j< 6;j+=3)
			{
				total+=2*i+j;
			}
		}
		
		System.out.println(total);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
