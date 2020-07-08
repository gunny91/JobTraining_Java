package pkg02;

public class Conditional01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println((3<1)? true:false);
		
		int x = 3,
			y =2;
		int result = x>y? 5:3;
		// if x is greater than y , then return 5, otherwise return 3
		System.out.println(result);
		
	}

}
