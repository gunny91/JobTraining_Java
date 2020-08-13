package practiceDay29;

public class practice8 {

	public static void main(String[] args) {
		
		// i for 3 bunch 
		for(int i = 1 ; i <4; i ++) // i <10; i +=3;
		{
			for(int j = 1; j <10; j++) // j for 9 of numbers 
			{
				for(int k = 3* i-2; k <3*i+1; k++) // for int x = i ; x<i+3; x++
				{
					System.out.print(k+ " x " +j +" = "+ k*j +"\t"); //syso x * y =x*y;
				}
				
				System.out.println();
			}
			System.out.println();
		}
		
		
		

	}

}
