package pkg15;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class MakeFile extends Thread{

	@Override
	public void run() {
		
		
		
		try {
			File dir = new File("D:\\JobTraining_Java\\day15\\temp");			
			
			if(dir.isDirectory())
			{
				for(int i = 0; i < 5; i++)
				{
					Thread.sleep(3000);
					
					Calendar cal = Calendar.getInstance();
					int min = cal.get(Calendar.MINUTE);
					int sec = cal.get(Calendar.SECOND);
					String fname =String.valueOf(min)+sec;
					String filename = "a"+fname+".txt";
					//System.out.println(filename);
					File myfile = new File(dir, filename);
					boolean bool = myfile.createNewFile();
					
					System.out.println("File : "+filename +" Created");
				
				}
			}
			
			System.out.println("Job is done");

		
		} catch (IOException e) {
			
			e.printStackTrace();
		}catch (InterruptedException e) {
			
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//Make file 5 per 3 sec
	//file name a(min)(sec).txt *5

	
	

	
}
