package pkg10;

public enum ShoseTypeName {

	WALKING("워킹"), RUNNING("러닝"), TRACKING("트래킹"), HIKING("하이킹");

	private String name;

	private ShoseTypeName(String name) {
		this.name = name;
	}
	
	
	public String getName()
	{
		return this.name;
	}
}
