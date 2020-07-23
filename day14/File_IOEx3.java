package pkg14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_IOEx3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		String path ="D:\\JobTraining_Java\\day14\\correction.txt";;
		BufferedWriter writeOn = new BufferedWriter(new FileWriter(path));
		writeOn.write("");
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
		
		
	}

}
