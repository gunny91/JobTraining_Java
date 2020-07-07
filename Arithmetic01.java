package pkg02;

public class Arithmetic01 {

	public static void main(String[] args) {
		// 10 A.M. Class

		int x =14;
		int y =5;
		int z= x+y;
		int mul = x*y;
		int div = x/y; //integer divide by integer is integer. So, when you divide by 17/5 = then the result will be 3 instead of 3.4
		int sub = x-y;
		
		System.out.println("Addition : " + z);
		System.out.println("Subtraction : " + sub);
		System.out.println("Multiplication : " +mul);
		System.out.println("Division : "+ div);
		
		z= x%y;
		
		System.out.println("Modula : "+z );
		
		
		
	}

}
