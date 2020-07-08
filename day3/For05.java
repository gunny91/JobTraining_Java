package pkg03;

public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp =0;
		for(int i =1 ; i<=10; i++)
		{
			if(i%3==0 || i%5 ==0)
			{
				temp+=i;
			}
		}
		System.out.println(temp);

		
		//sum A =not 3's multiplication + 1+2+4+5+50
		// Sum B = 3 + 6 + 9 ... +48
		//sumA- sumB =459
	
		int sumA=0;
		int sumB =0;
		for(int i = 1; i <=50; i++)
		{
			if(i%3==0)
			{
				sumB+=i;
			}
			else
			{
				sumA+=i;
			}
		}
		System.out.println("Total: "+(sumA-sumB));
	
	}

}
