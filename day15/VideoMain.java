package pkg15;

public class VideoMain {

	public static void main(String[] args) {
		String[] tPm = {"Nickoon","Chansung","WooYong","Teak"};
		
		PersonThread[] person = new PersonThread[tPm.length];
		
		for(int i =0; i< person.length; i++)
		{
			person[i] = new PersonThread(tPm[i]);// populate the instance values
		}
		
		for(int i =0; i <person.length;i++)
		{
			person[i].start(); // initiate to start!
		}
		
		
		
	}

}
