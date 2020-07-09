package pkg04;

public class method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getNumber(2,1));
		System.out.println(getNumber(1,2));
		System.out.println(getCalc(3));
		System.out.println(getCalc(4));
		System.out.println(getCalc(5));
		
		for(int i=3; i < 7;i++)
		{
			System.out.println(getCalc(i));
		}
		
	}
	
	//x=3 ==>9
	//x =5 ++>25
	//x =4 =>12
	
	public static int getCalc(int x)
	{
//		if(x%2==1){return x*x;}
//		else return x*3;	
		return x%2==0 ? x*3 : x*x;
	}
	
	
	//y=2*x1 + 3*x2-4
	
	public static int getNumber(int x, int y)
	{
		int result = 2*x+3*y-4;
		return result;
		
	}

		public  void  setSomething()
		{
						
		}
		
		
		static int getSub(int x, int y)
		{
			return x-y;
		}

		static int getAdd(int x, int y)
		{
			return x+y;
		}

}
