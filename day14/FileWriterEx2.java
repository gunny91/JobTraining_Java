package pkg14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx2 {

	
	public static void main(String[] args) throws IOException  {

//		
		String path ="D:\\JobTraining_Java\\day14\\practice2.txt";;
		BufferedWriter writeOn = new BufferedWriter(new FileWriter(path));
		writeOn.write("Korea");
		//writeOn.newLine();
		writeOn.newLine();
		writeOn.write("Hello");
		//writeOn.newLine();
		writeOn.newLine();
		writeOn.write("1234");	
	//	writeOn.newLine();
		writeOn.newLine();
		writeOn.close();
		
		System.out.println("Saving complete!");
		//	
		
//		String path = "D:\\JobTraining_Java\\day14\\score.txt";
//		File fileSource = new File(path);
//	
//		FileWriter fr =null;
//		BufferedWriter br =null;
//		
//		try {
//			fr = new FileWriter(fileSource);
//			br = new  BufferedWriter(fr);
//			br.write("¥Î«—πŒ±π");
//			br.newLine();
//			br.write("hello");
//			br.write("This is try catch");
//
//		}
//		catch(FileNotFoundException e){
//			e.printStackTrace();
//		}
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
//		catch (Exception e) 
//		{
//			e.printStackTrace();
//		}
//		finally {
//			
//			try {
//				if(br!=null) {br.close();};
//				if(fr!=null) {fr.close();};
//				
//				
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} //
//			try {
//				fr.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		

	}

	
}
