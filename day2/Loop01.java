package pkg02;

public class Loop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For Loop
		
		int x=0;
		
		for(int i=1; i <=10;i++)
		{
			x+=i;
			System.out.println(x+" Print 10 times");
		}
		System.out.println(x);

		//1+3+5+7+9
		
		int temp =0;
		for(int i =1; i <=9; i+=2)
		{
			temp+=i;
		}	
		System.out.println(temp);
	
	
		System.out.println("---------------------------------");
		
		int total =0;
		for(int i = 1; i <= 100; i+=3)
		{
			total +=i;
		}
		System.out.println(total);
		
		total =0;
		for(int i = 97; i >=2 ; i-=5)
		{
			total +=i;
		}
		System.out.println(total);
		
		
		
	
	
	}
}