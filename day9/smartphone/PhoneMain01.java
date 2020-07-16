package smartphone;

public class PhoneMain01 {

	public static void main(String[] args) {
		String phoneNo="01035545678";
		String songName="Some Song";
		
		SmartPhone phone01 = new SmartPhone (phoneNo, songName);
		phone01.sendCall();
		phone01.play();
		
		System.out.println("Phone01.calculate(3,5) : "+ phone01.calcualte(3,5));
		
		phone01.receiveSMS();
		phone01.stop();
	}

}
