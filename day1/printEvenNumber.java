package pkg02;

import java.util.Scanner;

public class printEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i <= 100; i++)
		{
			if(i%2 ==0)
			{
				System.out.println(i+ " It is an Even Number");
			}
			else 
				System.out.println(i+ " It is an Odd Number");
		}
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
	}

}
