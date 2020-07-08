package pkg01;

public class PrintfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 65;
		char ch ='a';
		double d = 12.3456;
		int age =35;
		String name = "Hong";
		System.out.printf("Á¤¼ö: %d\n", i);
		System.out.printf("char: %c\n", ch);
		System.out.printf("double : %f\n",d);
		System.out.printf("String : %s", name);

		//%f implied with the digit 10^-6
		System.out.printf("\n\ndouble1 :%f\n",d);
		System.out.printf("double2 :%6.2f\n",d); //m.nf Total m digits, until 10^-2
		System.out.printf("double3 :%.3f\n",d);
		
		//Cast! 
		ch = (char) i;
		System.out.println(ch);
		System.out.printf("%c",i);
		
		
		int weight =10 ;
		int height =4;
		
		int temp = (weight * height) /2;
		
		System.out.printf("³ÐÀÌ »ï°¢Çü: %f",temp);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
