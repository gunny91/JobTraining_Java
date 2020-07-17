package mypackage.persom;

import mypackage.enumtest.PERSON_TYPE;
import mypackage.player.Player;

public class Staff extends Person{
	private String department;
	public Staff(String name, int age, String address, String phoneNum, PERSON_TYPE pType,String depart) {
		super(name,age,address,phoneNum,pType);
		this.department=depart;
	}
	public void work()
	{
		System.out.println(super.getName()+" is teaching "+this.department);
	}
	
	@Override
	public String toString() {
		String result=super.toString();		
		result+="\nDepartment: "+this.department;
		return result;
		
	}
	public void play(Player mydvd) {
		
		System.out.println("\nInformation of " + getName()+"'s DVD");
		System.out.println(mydvd.toString());
		
	}
	
	
}
