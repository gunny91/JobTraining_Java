package pkg02;

public class Conditional02 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int x =3,
			y =2;
		int result = x>y ? 5:3;
		boolean check = x<y ? true : false;
		System.out.println("Result : "+ result);
		System.out.println(check);
		
		x =8;
		y =4;
		
		int temp = x > y ? x:y;
		
		System.out.println(temp);
		
		x =3;
		y =12;
		
		String another = y%x ==0 ? "Yes":"No"; 
		
		System.out.println(another);
		
		//x is even 2, otherwise wprhq
		
		int doIt = x%2 ==0 ? 2*x:x*x;
		System.out.println(doIt);
		
		
	}

}
