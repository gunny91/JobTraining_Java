package pkg07;

public class PointClass {

	private int xCoor;
	private int yCoor;

	public PointClass() {
			}
	
	public PointClass(int x, int y) {
		xCoor = x;
		yCoor = y;
	}

	public void showPoint() {
		System.out.println("Position: "+"("+xCoor +", "+ yCoor+")");

	}

	public void setXY(int x, int y) {
		this.xCoor = x;
		this.yCoor = y;

	}
}
