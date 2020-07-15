package pkg08;

public class Staff extends Person {
	
	private String department;
	
	public Staff()
	{}
	
	public Staff(String name, int age, String addr, String num, int type, String dep) {
		super(name,age,addr,num,type);
		this.department = dep;
	}


	public void work() {
		
		System.out.println( this.department +" is "+"Working");
	}
	
	

	@Override
	public  String toString() {

		String result = super.toString();
	
		result +=getName()+" is "+ this.department +" working";
		return result;
	}
	
	

}
