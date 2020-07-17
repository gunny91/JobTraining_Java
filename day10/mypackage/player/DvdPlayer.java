package mypackage.player;

public class DvdPlayer  implements Player{

	private String movieName;
	private String genre;
	private String direcor;

 	
	public DvdPlayer(String name, String genre, String direcor) {
		
		this.movieName =name;
		this.genre =genre;
		this.direcor =direcor;
	}
	
	@Override
	public String toString()
	{
		String result="";
		result+="===DVD Inforamtion===\n";
		result += "Title: "+this.movieName+"\n";
		result += "Genre : " + this.genre+"\n";
		result += "Director : " +this.direcor+"\n";
		return result;
	}
	@Override
	public void play(Player mydvd) {
		
		System.out.println();
		System.out.println(mydvd.toString());
		
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
	public void play() {
		// TODO Auto-generated method stub
		
	}
}
