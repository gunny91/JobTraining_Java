package pkg08;

public class Student extends Person  {
	
	private int schoolYear;
	private String grade;
	public Student(String name, int age, String addr, String num, int type, int k, String string4) {
	
		//"Kim", 30, "Jisanro", "0104011222",3,2,"A"
		
		super(name,age,addr,num,type);
		this.grade =string4;
		this.schoolYear=k;
		
	}
	public void learn()
	{
		System.out.println("School year: "+this.schoolYear );
		System.out.println( "Grade : "+this.grade);
//		result += getName()+" is "+"learning";
		System.out.println(getName()+" is Learning \n");
	}
	
	@Override
	public  String toString() {

//		super.toString();
//		this.learn();
//		return"";
		String result = super.toString();
	
		result += "School year: "+this.schoolYear +"\n";
		result += "Grade : "+this.grade +"\n";
		result += getName()+" is "+"learning";
		return result;
	}
	
	
}
