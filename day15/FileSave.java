package pkg15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSave {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Windows");
		BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\temp\\folder.txt"));
		BufferedWriter bfile = new BufferedWriter(new FileWriter("C:\\temp\\file.txt"));

		if(f.exists())
		{	
				File[] list = f.listFiles(); 					
				for(int i =0; i < list.length;i++)
				{
					if(list[i].isDirectory())
					{
						String temp ="";
						temp +="Folder: "+list[i].getName()+"\n";
						System.out.println("Folder : "+list[i].toString());
						bf.write(temp);
//						bf.write("Folder: "+list[i].toString());
//						bf.newLine();						
					}else if(list[i].isFile())
					{
						String x ="";
						x +="File: "+list[i].getName()+"\n";
						System.out.println("File : "+list[i].toString());
						bfile.write(x);
//						bfile.write("File: "+list[i].toString());
//						bfile.newLine();
					}	
				}	
				System.out.println("Job is done");
		}
		
		bfile.close();
		bf.close();
	}
}
