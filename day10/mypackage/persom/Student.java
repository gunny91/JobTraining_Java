package mypackage.persom;

import mypackage.enumtest.PERSON_TYPE;
import mypackage.enumtest.STUDENT_SCHOOLYEAR;

public class Student extends Person {

	private String grade;
	private PERSON_TYPE pType;
	private STUDENT_SCHOOLYEAR sYear;
	
	public Student()
	{}
	
	public Student(String name, int age, String address, String phoneNum, PERSON_TYPE pType,
			STUDENT_SCHOOLYEAR sYear, String grade) 
	{	
		super(name,age,address,phoneNum,pType);
		this.sYear=sYear;
		this.pType =pType;
		this.grade = grade;
	}

	
	public void learn(String subject)
	{
		System.out.println(getName()+" is taking "+subject);
	}
	
	@Override
	public String toString() {
		String result=super.toString();		
		result+="\nType of Person : "+pType +"\nYear : "+sYear+ "\nGrade : "+grade;
		return result;
		
	}
}
