package mypackage.persom;

import mypackage.enumtest.PERSON_TYPE;
import mypackage.sports.Sports;

public class Teacher extends Person {

	private String subject;
	
	

	public Teacher(String name, int age, String address, String phoneNum, PERSON_TYPE pType,String sub) {
		super(name,age,address,phoneNum,pType);
		this.subject =sub;
		
	}
	public void teach()
	{
		System.out.println(getName()+" is teaching "+this.subject);
	}
	
	@Override
	public String toString() {
		String result=super.toString();		
		result +="\nSubject to teach: "+this.subject;
		return result;
		
	}
	public void play(Sports sport) {
		System.out.println();
		System.out.println("Information of player : "+super.getName());
		System.out.println(sport.toString());
		
	}
	
}
