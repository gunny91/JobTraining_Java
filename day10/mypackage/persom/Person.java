package mypackage.persom;

import mypackage.enumtest.PERSON_TYPE;
import mypackage.player.Player;
import mypackage.sports.Sports;

public class Person {

	private String name;
	private int age;
	private String address;
	private String phone;
	private PERSON_TYPE pType;
	public Person()
	{}
	
	public Person(String name, int age, String address, String phone,PERSON_TYPE pType)
	{
		this.name =name;
		this.age =age;
		this.address=address;
		this.phone=phone;
		this.pType= pType;
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	@Override
	public String toString()
	{
		String result ="";
		result+="Name : "+ this.name;
		result+="\nAge : "+ this.age;
		result+="\nAddress : "+ this.address;
		result+="\nPhone Num : "+ this.phone;
		result+="\nType : "+this.pType+" ->>"+ this.pType.getName();
		return result;
		
	}


	public void showData(Player player, Sports sports) {
		
		System.out.println("\nName: "+this.getName());
		System.out.println(player.toString());
		System.out.println();
		
		System.out.println(sports.toString());
	
	}
}
