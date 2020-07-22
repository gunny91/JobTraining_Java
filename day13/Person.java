package pkg13;

public class Person {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Person() {}
	
	public Person(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math =math;
	}
	
	public String getName()
	{
		return name;
	}
	public int getEng()
	{
		return eng;
	}
	
	public int getMath()
	{
		return math;
	}
	
	public int getKor()
	{
		return kor;
	}
	

}
