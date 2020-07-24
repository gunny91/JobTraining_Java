package pkg15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile implements Runnable  {

	@Override
	public void run() {
	
		String path ="D:\\JobTraining_Java\\day14\\news.txt";
		File file = new File(path);
		FileReader fr =null;
		BufferedReader br =null;
		
		try {
			//BufferedReader br = new BufferedReader(new FileReader("D:\\JobTraining_Java\\day14\\news"));
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
//			br.read();
			if(file.isFile())
			{
				String str ="";
				while((str=br.readLine())!=null)
				{
					Thread.sleep(5000);
					System.out.println(str);
				}
			}
			
			
			System.out.println("Job is done");
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		
	
	}

	//read file in 5 minutes by line and show at the Monitor   news.txt
	
	
	
}
