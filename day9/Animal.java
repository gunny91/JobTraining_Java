package pkg09;

/**
 * 		Putpose of abstract class 
 * 		For the work, it is an mangatary format
 * 
 * 
 * 		How to make Abstract method
 * 		abstract public  String getSomething(); 
 * 
 * 
 * 		How to make abstract class 
 * 		put the abstact infront of class name
 * 		It is possible to put instance variable and method into the abstract class.
 * 		cf) Interface cannot implement method and instance variables
 * 
 * 
 * 		Abstract class must include with abstract method.
 * 		Force to override when extends from the abstract class.
 * 
 * 
 * 		@author Geonhee cho
 *		abstract public class Animal{}
 */

 public abstract class Animal {
	private String name;
	private String place;
	
	
	/**
	 * Constructor
	 */
	public Animal() {}
	
	/**
	 * Constructor of name and place
	 * @param name name of animal
	 * @param place name of place
	 */
	public Animal(String name, String place)
	{
		this.name = name;
		this.place =place;
	}
	
	
	/**
	 * Abstract method of move
	 */
	 public abstract void move();
	
	/**
	 * get name method to get the name
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * get the name of place
	 * @return place
	 */
	public String getPlace()
	{
		return this.place;
	}
	
	/**
	 * Temp method
	 */
	public void isMoving()
	{
		String temp = this.name + " is on the "+this.place;
		System.out.println(temp);
	}
		
	
}
