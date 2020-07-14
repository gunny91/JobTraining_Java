package pkg07;

public class Sports {

	
	private String name;
	private int members;
	
	public Sports(String name2, int member) {
		this.name=name2;
		this.members=member;
	}

	public void setName(String name)
	{
		this.name = name;
		//System.out.println("Name "+ this.name);
	}
	
	public void setMembers(int member)
	{
		this.members = member;
		System.out.println("Member : "+this.members);
	}

	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name : " + this.name);
		System.out.println("Member : "+ this.members);
		
	}
	
	//Similar variables or method should be belong to the Super class.
	
	
}
