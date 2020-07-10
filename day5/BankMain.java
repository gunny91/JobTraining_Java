package pkg05;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank("Gunny", "KB", 12345,551123); //created Object b
		Bank k = new Bank("LEE", "NIG",54321,121212); //created Object k
		//Bank s;
		//s = new Bank("F","M",1,2);
		b.getInfo(); // member assignment operator . something
		k.getInfo();
		//s.getInfo();
		//b==k (reference comparison)
		//x=y data overwrite
		// b = k; (Point to same reference)
	
	}

}
