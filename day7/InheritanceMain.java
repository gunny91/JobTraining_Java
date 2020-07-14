package pkg07;


class mySp{
	int x =100;
	protected String hello= "all that";
	protected void fHello()
	{
		System.out.println(this.hello);
	}
	
	
}

class MySb extends mySp{
	int y =200;

}
public class InheritanceMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySb sub = new MySb();
		sub.y=300;
		System.out.println("sub.y : "+sub.y);
		System.out.println(sub.x);
		sub.x =1000000;
		System.out.println("sub.x : "+sub.x);
		System.out.println(sub.hello);
		sub.fHello();
	}

}
