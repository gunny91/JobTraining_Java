package pkg12;

import java.util.Random;

public class RunnableEx  implements Runnable{

	
	

	@Override
	public void run() {
		 String[] arr = {"kara","BigBang","Lee","Moon"};
		//2sec term print 100 times
		for(int i =0; i < 100; i++)
		{
			String temp =arr[new Random().nextInt(arr.length)];
			System.out.println("Array : "+temp);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
}
