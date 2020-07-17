package mypackage.enumtest;

public enum PERSON_TYPE {
	STAFF("직원"),
	TEACHER("강사"),
	STUDENT("학생");

	private String name;
	
	private PERSON_TYPE(String name)
	{
		this.name =name;
	}
	
	public String getName() {
		return this.name;
		
	}
}
