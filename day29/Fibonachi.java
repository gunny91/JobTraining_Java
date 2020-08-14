package practiceDay29;

public class Fibonachi {

	public static void main(String[] args) {
		
		//1, 1 ,2 ,3 ,5
		
		System.out.println(fib(10));
		
//		int a=1,b=1,c=0;
//		
//		if(a<=1) { a = 1; c+=a; a++;}
//		else if(b <=1) {b=1; c+=b;}
//		
		
		 int a = 1, b = 1, c=0; 
	       
	        for (int i = 0; i <= 8; i++) 
	        { 
	        	c = a + b;
	        	System.out.println(b);
	        	a = b; 
	            b = c; 
	        } 
 
		
		
	}
	
	public static int fib(int n) 
    { 
        if (n <= 1) return n;
        
        return fib(n - 1) + fib(n - 2); 
    } 
}
