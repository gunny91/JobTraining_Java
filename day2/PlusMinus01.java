package pkg02;

public class PlusMinus01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a= 10;
		int b=20;
		int c;
		
		c = ++a + b++; //a is fist + will be second, last one is = so, 11 + 30 =c
	/**
	 * 
	 * The operating order
	 * ++a or --a is the most executable
	 * b++ or b-- is the least executable
	 * else 
	 * 	
	 */
		
		//a = a+1;
		//c = a+b;
		//b = b+1;
		
		
	System.out.println("a :" + a);
	System.out.println("b :" + b);
	System.out.println("c :" + c);
	System.out.println();
	c = a++ + --b;
	
	System.out.println("a :" + a);
	System.out.println("b :" + b);
	System.out.println("c :" + c);
	System.out.println();
	
	a =15;
	b= 12;
	c= --a +--b;
	
	System.out.println("a :" + a);
	System.out.println("b :" + b);
	System.out.println("c :" + c);
	String f = "hello";
	String g = "hello";
	System.out.println(f==g);
	
	

	
	
	//	System.out.println("Plus : "+ );
	//	System.out.println("Minus : "+ );
		
		

	}

}
