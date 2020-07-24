package pkg15;

public class PersonThread extends Thread {

	//private String name;
	public PersonThread(String name) {
		//this.name = name;
		super(name);
	}

	
	@Override
	public synchronized void run()
	{
		String threadName = super.getName();
		System.out.println(threadName+" Thread Start!");
		try {
				String videoName = VideoShop.vshop.lendVideo();
				System.out.println(threadName+" is lending "+videoName);
			
				int lentTime =3000;
				System.out.println(threadName+ "is lending "+ videoName +" "+lentTime/1000+"sec!");
				Thread.sleep(3000);
				
				System.out.println(threadName+ " is retirning "+videoName);
				VideoShop.vshop.returnVideo(videoName);
			
			} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		

		System.out.println(threadName+" Thread Completed!!");
		System.out.println("==============================");

	}
}
