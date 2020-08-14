package practiceDay29;

public class practice02 {

	public static void main(String[] args) {
	
		//1+(1+2) + (1+2+3) +...+(1+2+3...+10)
//		     1 2 3 4 5
//		
//              2	3 4  5	6 7      
//		     1 3 6 10 15 16 
		int sum =0;
		for(int i = 1 ; i <=10 ; i++)
		{
			for(int j = 1 ; j <=i ; j++)
			{
				sum += j;
			}
		}
		
		sum=0;
		int count=0;
		for(int i = 1; i <=10; i++)
		{
			System.out.println(sum+=i);
			count+=sum;			
		}
		System.out.println(count);
	}

	
	public static int getSum(int num)
	{
		int sum =num;
		
		return num +getSum(sum);
		
	}
}
