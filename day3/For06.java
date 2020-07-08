package pkg03;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total =0;
		
		for(float i =1; i <=100; i++)
		{
			total+= ((i-1)/i);			
		}		
		System.out.println(total);	
		System.out.println("------------");
		
		total =0;
		//subtract when it is an even number
		//adding it when it is an odd number
		for(float i =1; i <= 100; i++)
		{
			if(i%2==0)
			{
				total-=1/i;
			}else
			{
				total+=1/i;
			}
		}
		System.out.println(total);
		
	}

}
