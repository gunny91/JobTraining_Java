package pkg02;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i;
//		int multi;
//		for(i = 2; i <= 9; i+=2)
//		{
//			for(multi=1; multi <=9; multi++)
//			{
//				System.out.println(i + " x " + multi +" = "+ i*multi);
//			}
//			System.out.println();
//		}
		String temp ="";
		String space= " ";
		for(int i =1; i <=10; i++)
		{
			System.out.print(" ");
		}
			for(int j = 1; j <=i; j++)
			{
				
				temp+="*";
				if( j%2 == 1) 
				{
					System.out.println(temp);
				}
				
			//space+=temp;
			}
			
		

//		int total =0;
//		int num;
//		
//		for(num =1; num <=100; num++)
//		{
//			if(num%2==0)
//			{
//				continue;
//				
//			}
//			total += num;
//		}
//		
//		System.out.println(total);
		
	}

}
