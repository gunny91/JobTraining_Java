package pkg12;

public class ThreadTest extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		t1.run();
		t2.run();
		
	}
	
	public void run()
	{
	try {
			
			for(int i = 0 ; i  <10;i++)
			{
				Thread.sleep(500);
				System.out.println("Thread : "+ i);
			}
		}catch (InterruptedException e) {System.out.println(e);}
			
		}
	}


