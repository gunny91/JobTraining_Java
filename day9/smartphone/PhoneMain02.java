package smartphone;

public class PhoneMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneN = "010351111234";
		
		MiniPhone smp = new MiniPhone(phoneN);
		
		smp.sebdSNS();
		smp.receiveSMS();
	}

}
