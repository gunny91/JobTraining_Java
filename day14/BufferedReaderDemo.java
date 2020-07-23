package pkg14;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException, NumberFormatException {
		
		//FileReader, BufferReader
		
//		String path = "D:\\JobTraining_Java\\day14\\score.txt";
//		String savingPath ="D:\\JobTraining_Java\\day14\\correction.txt";;
//		BufferedWriter writeOn = new BufferedWriter(new FileWriter(savingPath));
//		File fileSource = new File(path);
//	
//		FileReader fr =null;
//		BufferedReader br =null;
//		
//		try {
//			fr = new FileReader(fileSource);
//			br = new  BufferedReader(fr);
//			String readL="";
//			while((readL=br.readLine()) !=null){
//				//System.out.println(readL);
//				MakeData(readL);
//			}
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
//		
		String path = "D:\\JobTraining_Java\\day14\\score.txt";
		String savingPath ="D:\\JobTraining_Java\\day14\\correction.txt";;
		
		BufferedReader bread = new BufferedReader(new FileReader(path));
		BufferedWriter writeOn = new BufferedWriter(new FileWriter(savingPath));
		String st;
		while((st=bread.readLine())!=null)
		{
			//System.out.println(st);
			writeOn.write(MakeData(st));
	
		}
		System.out.println("Saving complete!@");
		bread.close();
		writeOn.close();
	}

	private static String MakeData(String raw) throws IOException {
		
		String[] arr=raw.split(",");
		//System.out.println(Arrays.toString(arr));
			
		String name = arr[0];
		
		//System.out.println(name);
		Double kor = Double.parseDouble(arr[1]);
		Double eng = Double.parseDouble(arr[2]);
		Double math = Double.parseDouble(arr[3]);
		String gender = arr[4];
		
		//System.out.println(gender.equalsIgnoreCase("f"));
		String gen="";
		if(gender.equalsIgnoreCase("f")) //Upper and lower case ignore
		{
			gen="Woman";
		}else gen = "Man";
		
		Double total = kor+eng+math;
		Double avg = total/3;
		
		DecimalFormat df = new DecimalFormat("###.0");
		String temp = name+"/"+gen+"/"+df.format(total)+"/"+df.format(avg)+"/"+"\n";
//		System.out.printf("%s/%.1f/%.1f/%s",name,total,avg,gen);
//		System.out.println("Name : "+ name);
//		System.out.println("English : "+eng);
//		System.out.println("Math : "+math);
//		System.out.println("Korea: "+kor);
//		System.out.println("Gender: "+gender);
		
		return temp;
	
		
		
		
	}

}
