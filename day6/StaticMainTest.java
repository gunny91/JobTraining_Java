package pkg06;

public class StaticMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(MyStatic.x);
		//System.out.println(MyStatic.y);  -->> cannot printout until we declare the object
		
		//we made the instance obj
		MyStatic obj = new MyStatic();
		System.out.println(obj.y); //return y=200
		
		MyStatic.add(10,50);
		
		
		obj.hello("Shi");
	
		double radius = 10.0;
		double area = MyStatic.PI *radius *radius;
		
		//MyStatic.PI=5;
		/**
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		 * The final field MyStatic.PI cannot be assigned at pkg06.StaticMainTest.main(StaticMainTest.java:24)
		 */
		System.out.println("Area: " + area);
		
	}

}
