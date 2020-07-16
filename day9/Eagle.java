package pkg09;

public class Eagle extends Animal{

	public Eagle(String name, String place) {
		super(name, place);
	}

	/**
	 * Implemented method
	 */
	@Override
	public void move() {
		// TODO Auto-generated method stub
		//String temp ="";
		System.out.println(super.getName()+" is on the "+super.getPlace());
	}

}
