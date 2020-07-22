package pkg13;

public class Grade {

	private String name;
	private int num;
	private int whichClass;
	private int kor;
	private int eng;
	private int math;

	public Grade(){}
//	
	public Grade(String name, int num, int c, int k ,int e, int m)
	{
		this.name = name;
		this.num = num;
		this.whichClass = c;
		this.kor =k;
		eng = e;
		math =m;
		
	}
	
	public String getname()
	{
		return name;
	}

	public int getC() {return whichClass;}
	public int getNum() {return num;}
	public int getK() {return kor;}
	public int getE() {return eng;}
	public int getM() {return math;}


	
}
