package pkg08;

public class Teacher extends Person {

	private String subject;
	
	public Teacher(String name, int age, String addr, String num, int type, String sub) {
		//Teacher("Park",40, "yongSan", "01033334444",2,"Java"),
		
		super(name,age,addr,num,type);
		this.subject=sub;
	}
	
	public void teach()
	{
		System.out.println(getName()+" is "+"teaching "+this.subject);
	}

	@Override
	public  String toString() {
//		super.toString();
//		this.teach();
//		return"";
		String result = super.toString();
	
		result += "School year: "+this.subject +"\n";
		result +=getName()+" is "+"teaching "+this.subject;
		return result;
	}
	

}
