package pkg09;

public class Lion extends Animal{

	
	/**
	 * Constructor of Lion that initiate the name and place
	 * @param name
	 * @param place
	 */
	public Lion(String name, String place) {
		super(name,place);
		
	}

	/**
	 * The method to override from animal class
	 */
	@Override
	public void move() {
		System.out.println(getName()+" is in the "+getPlace());
		
	}

}
