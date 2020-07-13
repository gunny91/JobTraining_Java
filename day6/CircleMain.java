package pkg06;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle(3, 4, 10);
		Circle c2 = new Circle(8, 6, 20);
		
		System.out.println(c1.getStatus());
		System.out.println(c2.getStatus());
		
		c1.display();
		c2.display();
		
	}

}
