package pkg04;

public class method4 {

	public static void main(String[] args) {
		
		//return 
		//void -> do not return 
		int arr[] = {10,20,30};
		int arr1[] = {1,2,3,4};
		System.out.println(getSum(arr));
		System.out.println(getArr1(arr1)); //func04(¹è¿­)
	}
	
	public static int getSum(int[] x)
	{
		int sum=0;
		for(int i =0; i < x.length; i++)
		{
			sum+=x[i];
		}
		return sum;
	}
	
	/**
	 * Odd *3, even power
	 *  3+4+9+16 =32
	 * @param x
	 * @return
	 */
	public static int getArr1(int[] x)
	{
		int sum=0;
		int[] y= new int[10];
		for(int i =0; i < x.length; i++)
		{
			//x[i]%2==0? sum += x[i]*x[i] :sum += x[i]*3; 
			if(x[i]%2==0)
			{
				sum += x[i]*x[i];
			}else
				sum += x[i]*3;
		}
		return sum;
	}

	
	
	
	
}
