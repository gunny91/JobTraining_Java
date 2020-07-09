package pkg04;

public class method5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b= {10,20,-30,40};
		System.out.println(getAbsolute(b));
		
	}

	public static int getAbsolute(int[] x)
	{
		int sum=0;
		for(int i =0; i< x.length;i++)
		{
			if(x[i]<0)
			{
				sum+=Math.abs(x[i]);
			}	
			else
				sum+=x[i];
		}
		return sum;
	}
	
}
