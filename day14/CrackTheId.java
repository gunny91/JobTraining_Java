package pkg14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CrackTheId {

	public static void main(String[] args) throws IOException {
		
		String str ="abc(qwert)123";
		
		
//		int apos = str.indexOf("(");
//		System.out.println(apos);
		int end = str.indexOf(")");
		
	//	System.out.println(str.substring(apos+1, end));
		
	String path = "D:\\JobTraining_Java\\day14\\myid.txt";
	BufferedReader bread = new BufferedReader(new FileReader(path));
	//BufferedWriter writeOn = new BufferedWriter(new FileWriter("D:\\JobTraining_Java\\day14\\getID.txt"));
		String st;
		int i =0;
		while((st=bread.readLine())!=null )
		{
			int apos =st.indexOf("(");
			int dpos =st.indexOf(")");
			
			if(apos> -1 && dpos > -1)
			{
				if(apos+1 < dpos) {
				String id = st.substring(apos+1,dpos);
				System.out.println("["+i+"]"+id);
				i++;
				}
			}
		}	
		System.out.println("Job complete");
//			if(st.contains("("))
//			{
//				int front = st.indexOf("(");
//				if(st.contains(")")) {
//					int back =st.indexOf(")");
//				System.out.println("["+i+"]"+st.substring(front+1,back));
//				}
//				i++;
//			}
			
			
			
			
		}
		

	

}
