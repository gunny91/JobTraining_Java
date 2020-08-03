package mypkg.bean;

public class Member {
	private String id ;
	private String name ;
	private String address ;
	private String hobby ;
	private int salary ;	
	private String manager ;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", address=" + address + ", hobby=" + hobby + ", salary="
				+ salary + ", manager=" + manager + "]";
	}
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String name, String address, String hobby, int salary, String manager) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.hobby = hobby;
		this.salary = salary;
		this.manager = manager;
	}
	
	
}