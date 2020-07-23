package pkg14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GetName {

	public static void main(String[] args) throws IOException {
		int countLine =0;
		int countKang =0;
		
		String path = "D:\\JobTraining_Java\\day14\\news.txt";
		BufferedReader bread = new BufferedReader (new FileReader(path));
	
		String st;
		while((st=bread.readLine())!=null)
		{
			countLine++;
			
			if(st.indexOf("강")>-1) {
				countKang++;
			}
			
		}
		System.out.println("강호동 Count : "+"["+(countKang)+"]");
		System.out.println("News.txt File's Entire Line Count : "+"["+(countLine)+"]");
	}

}
