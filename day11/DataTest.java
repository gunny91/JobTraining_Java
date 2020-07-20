package pkg11;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DataTest {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		String format = "hh��: mm�� :ss��" ;
		
		//https://docs.oracle.com/javase/7/docs/api/
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String now = sdf.format(date);
		System.out.println(now);
		
		format = "yyyy�� mm�� dd�� hh:mm:ss X";
		SimpleDateFormat sdf1 = new SimpleDateFormat(format);
		String currentDate = sdf1.format(date);
		System.out.println(currentDate);
		
		
		format = " yyyy��,  mm�� E ����";
		format += "D��° �� , W��";
		SimpleDateFormat sdf2 = new SimpleDateFormat(format);
		now = sdf2.format(date);
		System.out.println(now);
	}

}
