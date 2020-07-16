package smartphone;

public class MiniPhone extends SmartPhone {

	private String num;
	public MiniPhone(String num)
	{
		this.num =num;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean sendCall() {
		
		return true;
	}

	@Override
	public boolean receiveCall() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sebdSNS() {
		System.out.println("Get the Text bro! "+ this.num);
		return true;
	}

	@Override
	public boolean receiveSMS() {
		System.out.println("Text came bro! "+ this.num);
		return true;
	}

}
