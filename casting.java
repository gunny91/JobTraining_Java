package pkg02;

/**
 * 
 * @author Geonhee Cho
 *
 */
public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = (int)3.14;
		System.out.println("i : "+ i);
		
		double x = 100;
		System.out.println(x);
		
		System.out.println(14/5); //2
		System.out.println((double)14/5); //2.8
		System.out.println((double)(14/5)); //2.0
		
		int kor =50,
			eng =60,
			math =80;
		int total = kor+eng+math;
		double averege = (double)total /30;
		System.out.println(total);
		System.out.println(averege);
		
		char ch1 ='c';
		char ch2 = 'd';
		boolean bool = ch1> ch2;
		System.out.println(bool);
		
		int result = ch1 - ch2+3;
		System.out.println(result);
		
		int num = 10;
		int num2 = 20;
		
		int result1 = (num >=10)? num2+10:num2-10;
		System.out.println(result1);
		
	}

}
