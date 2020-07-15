package pkg08;

public class Person {

	private String name;
	private int age;
	private String address;
	private String phoneNum;
	private int type;
	
	public Person()
	{}
	
	
	
	public Person(String name2, int age2, String addr, String num, int type2)
	{
		this.name = name2;
		this.age = age2;
		this.address = addr;
		this.phoneNum =num;
		this.type =type2;
	}


	public String getName()
	{
		return this.name;
	}
	
	public String toString() {

		String result ="";
		result += "Name : " + this.name +"\n";
		result += "Age : " + this.age +"\n";
		result += "Phone Number : " + this.phoneNum +"\n";
		result += "Address : " + this.address+"\n";
		result += "Type : " + this.type +"\n";
		result += "Phone Number " + this.phoneNum +"\n";
		return result;
	}
	
	
}
