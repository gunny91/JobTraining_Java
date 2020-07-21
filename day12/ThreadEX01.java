package pkg12;

public class ThreadEX01 {

	public static void main(String[] args) {
		//UserCalendar -> print current time Current time : A.M. 10: 22:35
		System.out.println("Start Main Thread");
		RandomCreator rc = new RandomCreator();
		
		rc.run();
		rc.start();
		
		for(int i=0; i <30; i++)
		{
			new UserCalendar();
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("End Main Thread");
		
		
		

	}


}
