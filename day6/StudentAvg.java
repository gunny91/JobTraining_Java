package pkg06;

public class StudentAvg {
	private String name;
	private int kor = 80;
	private int eng = 70;
	private int math = 50;
	private double avg;
	private int total;

	public StudentAvg(String name, int x) {
		this.name = name;
		this.kor = x;
		total = this.kor + eng + math;
		avg = total / 3;
	}

	public StudentAvg(String name, int x, int y) {
		this.name = name;
		this.kor = x;
		this.eng = y;
		total = this.kor + eng + math;

		avg = total / 3;
	}

	public StudentAvg(String name, int x, int y, int z) {
		this.name = name;
		this.kor = x;
		this.eng = y;
		this.math = z;
		total = this.kor + this.eng + this.math;
		avg = total / 3;

	}

	public void display() {

		//double total = this.kr +this.eng + this.math
		//double avg = total /3.0
		
		//printf("%s %f %f \n", this.name, total, average)
		System.out.println(this.name + " Total: " + this.total + " Average: " + this.avg);

	}

}
