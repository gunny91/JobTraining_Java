package pkg12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ThreadEx extends Thread{

	//3 sec print 100 times of tim
	
	public ThreadEx(String name) {
		super(name);
	}
	
	@Override
	public void run()
	{
		for(int i =0; i < 100; i++)
		{
			Date date = new Date();
			String getTime =super.getName()+" hh:mm:ss ";
			SimpleDateFormat ss = new SimpleDateFormat(getTime);
			String now = ss.format(date);
			System.out.println(now);
			
			try {
					Thread.sleep(3000);
				}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}

	}
}
