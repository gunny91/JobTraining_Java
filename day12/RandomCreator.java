package pkg12;

import java.util.Random;

/**
 * Extends Thread class to use thread
 * We are Override the run method which is in Thread class
 * call the start() method 
 * start() method is the thing can make sure to run() method to triger to start the program
 * 
 * @author Geonhee Cho
 *
 */
public class RandomCreator extends Thread{
	//among 1~45 number, print out one of these 100 times
	
	/**
	 * run() method --> it is like a place or area that developer created 
	 */
	@Override
	public void run()
	{
		
		Random r = new Random();
		
		for(int i =0; i <30; i++)
		{
			int getRand = r.nextInt(45)+1;
			System.out.println("Random num: "+getRand);
			try {
					Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		
	}
	
	
}
