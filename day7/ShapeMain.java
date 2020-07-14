package pkg07;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle("Circle",3,4);
		c.showCircle();
		System.out.println();
		
		Rectangle rec = new Rectangle("Rectangle",10,10);
		rec.showRec();
		
		System.out.println();
		Triangle tri = new Triangle("Triangle",10,10);
		tri.showTri();
	}

}
