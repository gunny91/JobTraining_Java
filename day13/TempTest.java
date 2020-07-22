package pkg13;

import java.text.DecimalFormat;
import java.util.Arrays;

public class TempTest {

	//Decimal format
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp ="###,###.00";
		
		DecimalFormat df = new DecimalFormat(temp);
		
		double num = 12345.6789;
		String result = df.format(num);
		
		System.out.println(result);
		
		String[] str = {"apple","banana"};
		
		System.out.println(Arrays.toString(str));
	}

}
