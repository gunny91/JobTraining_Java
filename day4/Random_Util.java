package pkg04;

import java.util.Random;
import java.util.Scanner;

public class Random_Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int getRandom = r.nextInt(49)+1;
		System.out.println("Type in: ");
		Scanner in = new Scanner(System.in);
		
		while(getRandom ==in.nextInt())
		{
			System.out.println("Type in: ");
			System.out.println();
			if(getRandom <in.nextInt())
			{
				System.out.println("Get up!");
			}
			else if(getRandom > in.nextInt())
			{
				System.out.println("Get Down!");
			}
			else if(getRandom == in.nextInt())
			{
				System.out.println("you got it!");
				break;
			}
		}
	}

}
