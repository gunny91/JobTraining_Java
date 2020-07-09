package pkg04;

import java.util.*;
public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		//computer store the data for random number
		int getRand = r.nextInt(49)+1;
		
		while(true)
		{
			System.out.println("Type the Num: ");
			int typeNum = in.nextInt();
			
			if(getRand> typeNum) {System.out.println("Too less!");}
			else if(getRand < typeNum){System.out.println("Too much!");}
			else if(getRand == typeNum){System.out.println("You got it!"); break;}
			
		}
		
		
	}

}
