package pkg08;

class MySuper {

	int x = 100;

	public void showData() {
		System.out.println("Yo, you called super You used the super.method when you override your method in sub class");
	}
}


class MySub extends MySuper{
	int y = 200;
	
	@Override
	public void showData()
	{
		super.showData();
		System.out.println("I am a sub class that using overriding my parent's method");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String temp = super.toString()+"\navc";
		return temp;
	}
	
	public void Display()
	{
		System.out.println("show");
	}
}

public class ReferenceTest {

	public static void main(String[] args) {
		MySuper sub = new MySub(); //Up-Casting
//		System.out.println(sub.y);
		System.out.println(sub.x);
		sub.showData();
		//sub.
		int i = (int)3.14;
		MySub sss = (MySub)sub; // Down Casting  
		System.out.println(sss.y);
		sss.Display();
		
		System.out.println(sub);
		System.out.println(sub.toString());
		
//		MySuper sup = new MySuper();
		
		/**
		 * Reference type change Two classes which inheritance each other, can casting
		 * 
		 * UpCasting : sub class promote the data type to super class (temporary)
		 * DownCasting : Super to sub
		 */
		// 				super   	sub
		/**
			 * 	Variable : 	Possible 	Impossible 	 ->>>Super calls method can approach 
		 * 
		 * (super)Method :   	O		        X        ->>>Can access to super class's method
		 * 
		 *     Overriding:		O   		    O        ->>>Sub class's method can use it. Method encapsulation
		 * 
		 * 	 (sub)Method :      X				O		 ->>>Sub method cannot approach

		 * Collection 
		 * JSP ()
		 * Smart Phone programming
		 * 
		 * Object class
		 * 
		 * 
		 * 
		 */
		
		int n =100;
		int count=0;
		
		
		for (int x= 2; x <= n; x++) {
			if( x/2 ==1 || x%2 ==1 && (Math.pow(x,i)%3!=0) )
			{
				System.out.println(x);
				count ++;
			}
		}
		System.out.println(count);

	}

}
