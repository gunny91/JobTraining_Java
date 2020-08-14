package practiceDay30;

import java.util.Arrays;
import java.util.Random;

public class LottoRandom {

	// print out 1~45 num as each 6 count
	public static void main(String[] args) {
		
		int[] ball = new int[6];
		Random r = new Random();
		int random;
		

		System.out.println("You got the Lotto number as bellow! ");
//		for (int i = 0; i < ball.length; i++) 
//		{
//
//			random	=	r.nextInt(45)+1;	
//		
//			for(int j = 0 ; j < ball.length; j++) {
//				ball[j]= r.nextInt(45)+1;
//				 if (ball[j] == random ) 
//				 {
//					 random =r.nextInt(45)+1;
//					 j--;
//				 }
//			}
//			 ball[i] = random;
//			System.out.print(ball[i]+"\t");
//		}
		
		
		for (int i = 0; i < ball.length; i++) 
		{
			ball[i] =r.nextInt(45)+1;
			
			if(i>0) {
				for (int j = 0; j < i; j++) {
					if(ball[j]==ball[i])
					{
						i--;
					}
					
				}
			}
		}
		
		
		for (int i = 0; i < ball.length-1; i++) {
		//	System.out.print(ball[i]+"\t");
			for (int j = 0; j < ball.length-1-i; j++) {
				if(ball[j] > ball[j+1])
				{
					int temp =ball[j];
					ball[j] =ball[j+1];
					ball[j+1]=temp;
				}
			}
		}
		
		for (int i = 0; i < ball.length; i++) {
			System.out.print(ball[i]+"\t");
		}
		
		
			
		
	}
	
	
}
