package pkg06;

/**
 * static variable or method can access to class
 * Instance variable or method need to create the object before access into.
 * @author Geonhee Cho
 *
 */
public class MyStatic 
{
	
	//class variable : Possible to access with class name
	static int x =300;
	
	//Instance variable must access with object
	int y =200; //Instance variable
	
	//static double PI = 3.14;
	
	//Final keyword : Read only! Cannot modify it! final make the value as constant value
	static final double PI=3.14; //»ó¼ö
	
	//instance method
	public void hello(String str)
	{
		System.out.println(str);
	}
	
	
	//Static method = class method!
	public static void add(int x, int y)
	{
		int result = x+y;
		System.out.println(result);
	}
	
}
