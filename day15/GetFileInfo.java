package pkg15;

import java.io.File;
import java.io.IOException;

public class GetFileInfo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\JobTraining_Java\\day15\\mytest");
		boolean bool = false;
//		System.out.println(f.getName());
//		
//		System.out.println(f.getPath());
//		System.out.println(f.canRead());
//		System.out.println(f.canExecute());
//		System.out.println(f.listFiles());
//		
//		
		if(f.exists())
		{
			System.out.println("Hey, I am here!");
			
			if(f.isDirectory())
			{
				System.out.println("Directory");
				File newfile = new File("D:\\JobTraining_Java\\day15\\mytest\\cc.txt");
				bool =newfile.createNewFile();
				
				if(!bool)
				{
					System.out.println("Job success!");
				}
				else System.out.println("Job failed!");
				
				File[] list = f.listFiles();
				System.out.println("Print out the list");
				for(int i =0; i < list.length;i++)
				{
					//System.out.println(list[i].toString());
					if(list[i].isFile())
					{
						System.out.println("File : "+list[i].getName());
						
						if(list[i].getName().toLowerCase().equals("a.txt"))
						{
							System.out.println("File info Pirnt");
							System.out.println(" Absolute Path : "+list[i].getAbsolutePath());
							System.out.println("Is Hidden? : "+list[i].isHidden());
							System.out.println("File size : "+list[i].length());
							System.out.println("When is the last modified? : "+list[i].lastModified());	
						}else if(list[i].getName().toLowerCase().equals("b.txt"))
						{
							boolean bool1 = list[i].delete();
							if(bool1)
							{
								list[i].delete();
								System.out.println("Delete Success");
							}
							else {System.out.println("Delete Failed");}
							

						}

						
					}
					else
					{
						System.out.println("Folder : "+list[i].getName());
						//Name change to temp folder
						if(list[i].getName().toLowerCase().equals("folder1"))
						{
							boolean bool2 =list[i].renameTo(new File("D:\\JobTraining_Java\\day15\\temp"));
							if(bool2)
							{
								System.out.println("Folder name change");
								
								
							}else System.out.println("Failed");
						}
					}
					
					
				}
					
				
			}else {System.out.println("File");}
			
			
		}else {System.out.println("Hey Where did you make it");}
	}

}
