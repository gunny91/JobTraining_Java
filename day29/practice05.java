package practiceDay29;

import java.util.Random;

public class practice05 {

	public static void main(String[] args) {
		Random r = new Random();
		
		for(int i = 1; i <=6; i++)
		{
			for(int j =1; j<=6; j++) {
				if(i+j==6) {System.out.println(i+":"+j);}
			}
		}
		
		
		for(int i =0; ;i++){
			int getDice1 = r.nextInt(6)+1;
			int getDice2 = r.nextInt(6)+1;
			if(getDice1+getDice2==6)
			{
				System.out.println(getDice1 +" : "+ getDice2); break;
			}
		}
		
		
		
		
		
		
		
		

	}

}
