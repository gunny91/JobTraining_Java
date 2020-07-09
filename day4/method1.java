package pkg04;

public class method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Why use Method? We can reuse the code !!!
		/**
		 * 3 type of method
		 * :Name, parametor, type of return
		 * 
		 * How to write the method?
		 * 
		 * 				public         return type name ( parametors ) { return;}
		 * 				private
		 * 				protected
		 * 
		 */
		System.out.println(getAverage(3.0,5.0));
		
		System.out.println(getAverage(3.5,10.0));
		
	}

	
	public static double getAverage(double d, double e)
	{
		double total= (d+e)/2;
		return total; 
	}
}
