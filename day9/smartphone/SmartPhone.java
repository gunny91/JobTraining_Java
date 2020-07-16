package smartphone;

public class SmartPhone extends PDA implements MobilePhone{
	
	private String phoneNo;
	private String songName;
	
	public SmartPhone()
	{
		
	}
	public SmartPhone(String phoneNo, String songName) {
		this.phoneNo =phoneNo;
		this.songName = songName;
	}

	@Override
	public void play() {
		System.out.println("Playing song to "+this.songName);
		
	}

	@Override
	public void stop() {
		System.out.println(this.songName+" is Stopped!");
		
	}

	@Override
	public boolean sendCall() {
		System.out.println("Receiver " + this.phoneNo+" calling");
		return true;
	}

	@Override
	public boolean receiveCall() {
		System.out.println();
		return true;
	}

	@Override
	public boolean sebdSNS() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean receiveSMS() {
		System.out.println(this.phoneNo+" Receving SNS");
		return false;
	}

}
