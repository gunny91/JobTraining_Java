package pkg15;

import java.util.Vector;

public class VideoShop {

	String[] arrVideo = {"Nigga in Paris", "Victory"};
	
	public static VideoShop vshop = new VideoShop(); 
	private Vector<String> videoList = new Vector<String>();
	
	public VideoShop()
	{
		for(int i = 0; i < arrVideo.length;i++)
		{
			videoList.addElement(arrVideo[i]);
			
		}
	}
	
	public synchronized String lendVideo() throws InterruptedException
	{
		String threadName = Thread.currentThread().getName();
		
		if(videoList.size() ==0)
		{
			System.out.println(threadName+", we do not have any items. Wait for the order that you will lend it");
			super.wait();
		}
		
		String VideoName =this.videoList.remove(videoList.size()-1);
		return VideoName;
	}
	
	public synchronized void returnVideo(String video)
	{
		this.videoList.addElement(video);
		super.notify();
	}
}
