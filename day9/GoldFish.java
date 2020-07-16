package pkg09;

public class GoldFish extends Animal {

	public GoldFish(String name, String place) {
		super(name,place);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is in the "+getPlace());
	}

}
