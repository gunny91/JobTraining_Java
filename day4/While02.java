package pkg04;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//30 20 10 -10 ... 0 or - value then break
		
		Scanner in = new Scanner(System.in);
		//Get the number and get the total sum
		int totalSum =0;
		while(true)
		{
			System.out.println("Enter the Integer Value");
			int getNum = in.nextInt();
			
			if(getNum > 0 )
			{
				
				totalSum+=getNum;
				System.out.println("You got the Total Sum : "+totalSum);
			}
			else
			{
				System.out.println("You put whether 0 or - value");
				System.out.println("You got the Total Sum    "+totalSum +"   so far");
				break;
			}
		}
	}

}
