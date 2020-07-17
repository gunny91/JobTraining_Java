package mypackage.main;

import mypackage.enumtest.PERSON_TYPE;

public class TotalMain01 {
	
	private String name;
	private int age;
	private PERSON_TYPE type;
	
	public static void main(String[] args) {
		TotalMain01 soo = new TotalMain01();
		
		soo.name ="Kim";
		soo.age =50;
		soo.type=PERSON_TYPE.STUDENT;
		
		System.out.println("Name : "+ soo.name);
		System.out.println("Age : "+ soo.age);
		System.out.println("Type : "+ soo.type);
		System.out.println("Work Name : "+ soo.type.getName());
	}

}
