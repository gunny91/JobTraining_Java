package pkg03;

import java.util.Scanner;

public class ForPactice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~10 odd total even total
		
		int totalOdd =0;
		int totalEven=0;
		for(int i =1; i <=10; i++)
		{
			
			if(i%2 == 0)
			{
				totalEven +=i;

			}
			else if(i%2==1) {totalOdd+=i;}
		}
		System.out.println("Even : "+totalEven);
		System.out.println("Odd : "+totalOdd);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type in the Starts : ");
		int num=in.nextInt();
		for(int i =1; i <= num; i++)
		{
			System.out.print("*");
			if(i%5==0) //enter the star var when it filled with 5
			{
				System.out.println();
			}
			
//			for(int j=0; j<5;j++)
//			{
//				System.out.print("*");
//			}
		}
		
		System.out.println("-----------------");
		//sun = 3+6+9
		//sum = 1+4+7 +10 =22
		//sun 2+5+8 =15
		
		int sum1=0;
		int sum2=0;
		int sum3=0;
		for(int i =1; i <=10; i++)
		{
			
			if(i%3==0)
			{
				sum1+=i;
			}
			else if(i%3==1)
			{
				sum2+=i;
			}
			else if(i%3==2)
			{
				sum3+=i;
			}
		}
		System.out.println("sum1 : " +sum1 );
		System.out.println("sum2 : " +sum2 );
		System.out.println("sum3 : " +sum3 );
	
		System.out.println("-----------------");
		sum1=0;
		sum2=0;
		sum3=0;
		for(int i = 1; i <= 10 ;i++) {
			switch(i%3)
			{
				case 0: sum1+=i; break;
				case 1:	sum2+=i; break;
				case 2:	sum3+=i; break;
			}
			
		}
		System.out.println("Sum1 : "+ (sum1));
		System.out.println("Sum2 : "+ (sum2));
		System.out.println("Sum3 : "+ (sum3));
		
		
		//print star
		
		
	}
	
	

}
