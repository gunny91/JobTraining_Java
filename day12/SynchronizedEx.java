package pkg12;

public class SynchronizedEx {

	public static void main(String[] args) {

		int input =1000;
		
		ATM atm = new ATM(input);
		
		Thread soo = new Thread(atm,"��");
		Thread park = new Thread(atm,"��");
		
		soo.start();
		park.start();

	}

}
