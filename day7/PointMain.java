package pkg07;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointClass point = new PointClass();
		point.setXY(5, 7);
		point.showPoint();
		System.out.println();
		
		ColorPoint color = new ColorPoint(1,2);
		color.setXY(3,4);
		color.setColor("red");
		
		color.colorPrint();
		color.showPoint();
		
		String[] mycolor = {"Black","Red","Blue"};
		ColorPoint[] p1 = new ColorPoint[3];
		
		for (int i = 0; i < p1.length; i++) 
		{
			p1[i] = new ColorPoint();	
			p1[i].setXY(i, 2*i);
			p1[i].setColor(mycolor[i]);
			p1[i].showPoint();
			p1[i].colorPrint();
			
		}
		
		
	}

}
