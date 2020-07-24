package pkg15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ScoreScanner {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JobTraining_Java\\day15\\getScore.txt"));
		DecimalFormat df = new DecimalFormat("###.0");
		Scanner in = new Scanner(System.in);
		
		for(int i =0; i < 2; i++)
		{
			System.out.print("Enter Name: ");
			String name = in.next();
			
			System.out.print("Korea Score: ");
			double kor = in.nextDouble();
			
			System.out.print("English Score: ");
			double eng = in.nextDouble();
			System.out.print("Math Score: ");
			double math = in.nextDouble();
	
			double total = kor+eng +math;
			double avg = total/3;
			String temp ="";
			temp +=name+","+kor + ","+eng+","+math +","+total +","+df.format(avg);
			
			bw.write(temp);
			bw.newLine();
			
		
		}
		
		
		
		bw.close();
		in.close();
		System.out.println("Work Completed");
		

	}

}
