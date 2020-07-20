package pkg11;

import java.util.Scanner;

public class CalcClass {

	int SqurareSum(int max)
	{
		int sum =0;
		for(int i = 0 ; i <=max; i++)
		{
			if(i %2 ==0)
			{
				sum-=Math.pow(i, 3);
			}
			else if(i%2==1)
			{
				sum+=Math.pow(i, 2);
			}
		}
		return sum;
	}
	
	String SquareSumExp(int max)
	{
		
		String exp ="";
		for (int i = 1; i <= max; i++) {
			if(i%2 ==1)
			{
				exp+= i+ "^"+2;
			}
			else if(i%2 ==0)
			{
				if(i ==max)
				{
					exp+=" - " +i + "^"+3;
				}
				else 
				{
					exp+=" - " +i + "^"+3+" + ";
				}
			}
			
		}
		return exp;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CalcClass cc = new CalcClass();
		
		System.out.println("Enert Num");
		int max = sc.nextInt();
		System.out.println("Format");
		System.out.println(cc.SquareSumExp(max));
		System.out.println("Result: ");
		System.out.println("Result "+cc.SqurareSum(max));
	}

	
}
