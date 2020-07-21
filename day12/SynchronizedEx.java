package pkg12;

public class SynchronizedEx {

	public static void main(String[] args) {

		int input =1000;
		
		ATM atm = new ATM(input);
		
		Thread soo = new Thread(atm,"±è");
		Thread park = new Thread(atm,"¹Ú");
		
		soo.start();
		park.start();

	}

}
