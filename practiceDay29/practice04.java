package practiceDay29;

public class practice04 {

	public static void main(String[] args) {
		
		for (int i = 0; i <=10; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println();		
		
		int count =0;
		String star="";
		while(count <=10)
		{
			star+="*";
			System.out.println(star);
			count ++;
		}
		
		
	}
	
	
}
