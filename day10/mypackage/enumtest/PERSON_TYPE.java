package mypackage.enumtest;

public enum PERSON_TYPE {
	STAFF("����"),
	TEACHER("����"),
	STUDENT("�л�");

	private String name;
	
	private PERSON_TYPE(String name)
	{
		this.name =name;
	}
	
	public String getName() {
		return this.name;
		
	}
}
