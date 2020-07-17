package mypackage.player;

public class Mp3Player implements Player {
	private String title;
	private int playtime;
	private String singer;
	
	public Mp3Player(String title, int playtime) {
		
		this.title=title;
		this.playtime=playtime;
	}

	
	@Override
	public String toString()
	{
		String result="";
		result+="===MP3 Inforamtion===\n";
		result += "Song Title: "+this.title+"\n";
		result += "Play hour : " + this.playtime+"\n";
	
		return result;
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
	public void slow() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void play(Player mydvd) {
		// TODO Auto-generated method stub
		
	}
}
