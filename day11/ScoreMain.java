package pkg11;

import java.util.Scanner;

public class ScoreMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//avg 60 over, oveer 40 each 180 > pass 40 > pass 
		String name = "Kim";
		//int kor =100, eng =100, math =20;
		//int kor =50, eng =50, math =50;
		//int kor =50, eng =50, math =100;
		
		//minScoreException
		//FailedException -->>avg
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the kor,eng,math scores");
		System.out.print("Enter the kor score \t : ");
		int kor = in.nextInt();
		System.out.print("Enter the eng score \t : ");
		int eng = in.nextInt();
		System.out.print("Enter the math score \t : ");
		int math = in.nextInt();
	
		int total =kor +eng +math;
		
		double average =(double )total /3.0;
		System.out.println(total);
		System.out.println(average);

			
		if(average > 60)
		{
			System.out.println("You passed as your exam average");
		}else
		{
			try 
			{
				String message = name+" got the "+"FailedException";
				throw new FailedException(message);
			}
			catch(FailedException e)
			{
//				System.out.println(e.toString());
//				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
//	
		
		if(eng > 40 && math > 40 && kor > 40 )
		{
			System.out.println("The each min scores are Passed");
		}
		else {
				try 
				{
					String message = name+ " got the " +"MinScoreException";
					throw new MinScoreException(message);
				}
				catch(MinScoreException e)
				{
					//System.out.println(e.toString());
					//System.out.println(e.getMessage());
					e.printStackTrace();
				}
		}
		in.close();
		
		
//		int[] temp = {eng, math, kor};
//		String getName="";
//		int x;
//		for(int i =0; i< temp.length; i++)
//		{
//			if(temp[i]<40)
//			{
//				x =temp[i];
//			}
//		}
		
	}

}
