package pkg07;

public class SportsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soccer soc = new Soccer("Soccer", 11, 5);
		BaseBall b = new BaseBall("BaseBall",9,3);
		BasketBall bas = new BasketBall("BasketBall",5,20);
		
		soc.setName("Jeol");
		
		soc.showSoccer();
		b.showBaseBall();
		bas.showBasketBall();
	}

}
