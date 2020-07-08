package pkg03;

public class Forloop06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumA=0; //store the 3 times value	
		int sumB=0; //store the non-3 time's value & bigger than 5, also not include with 8 
		int sumC=0; //store the less than 5 values.
		for(int i =1; i <=10; i++)
		{
			if(i%3==0)
			{
				sumA+=i;
			}
			else if(i>=5 && i%3 !=0 && i!=8)
			{
				sumB+=i;
			}
			else if(i <5 && i%3!=0)
			{
				sumC+=i;
			}
		}
		
		System.out.println(sumA);
		System.out.println(sumB);
		System.out.println(sumC);
		
		System.out.println("------------------");
	}

}
