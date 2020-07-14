package pkg07;

class MySp1 
{
		private String name;
	
		public MySp1() {
			// TODO Auto-generated constructor stub
			System.out.println("Non-Parametor MySp1 constructor called"); // 1
		}
		
		public MySp1(String name) {
			// TODO Auto-generated constructor stub
			System.out.println("Super 1");
			this.name =name;
//			System.out.println("Non-Parametor MySp1 constructor called "+ this.name); // 1
		}
		
		
		public void getName(String name)
		{
			System.out.println("Name: "+this.name);	
		}
}

class MySb1 extends MySp1 
{
		public MySb1() {
			// TODO Auto-generated constructor stub
			System.out.println("Non-Parametor MySb1 constructor called"); //2
	
		}
	
		public MySb1(String name) {
			super(name); //3
			System.out.println("The one parametor MySb1 class constructor called");//4
		}
	
	//	public MySb1(String getName)
	//	{
	//		super();
	//		System.out.println("I got the name "+getName);
	//		
	//	}

}

public class InheritanceMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySb1 sub = new MySb1();
		MySb1 kim = new MySb1("Kim"); // When we use the Inheritance, the super class's constructor will operating
										// first.
		// it is hidden super(); at sub class's constructor.

		/**
		 * super(); Called the constructor from the parent's class.
		 */
		kim.getName("kim");

	}

}
