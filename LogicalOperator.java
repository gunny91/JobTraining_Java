package pkg02;

public class LogicalOperator {

	public static void main(String[] args) {
		//> < >= == != result return to True or False (boolean)
		//It is required to use in if or for statement
		
		// Logic
		//&&: all true 
		//||: all false
		// !: revert it
		
		/**
		 * 
		 * &&
		 * 0 0 = 0
		 * 0 1 = 0
		 * 1 0 = 0
		 * 1 1 = 1
		 */
		
		/**
		 *  ||
		 * 0 0 = F
		 * 0 1 = T
		 * 1 0 = T
		 * 1 1 = T 
		 */
		
		System.out.println(3 >=2); //T
		System.out.println(-1 < 0); //T
		System.out.println(3.45 <= 2);//F
		System.out.println(3==2);// F
		System.out.println(3 !=2);//T
		System.out.println('a' < 'b'); //T
		
		int x=3, y=2;
		System.out.println((3>2) &&(3>4)); //F
		System.out.println(!(3!=2));
		System.out.println(x!=y||-1>0);
		System.out.println();
		
	}

}
