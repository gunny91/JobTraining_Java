package pkg10;

public enum ShoseTypeName {

	WALKING("��ŷ"), RUNNING("����"), TRACKING("Ʈ��ŷ"), HIKING("����ŷ");

	private String name;

	private ShoseTypeName(String name) {
		this.name = name;
	}
	
	
	public String getName()
	{
		return this.name;
	}
}
