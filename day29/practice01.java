package practiceDay29;

public class practice01 {

	public static void main(String[] args) {
		
		int count =0;
		for(int i = 1; i <=20; i++)
		{
			if(!(i%2==0||i%3==0)) 
			{
				count+=i;
			}
		}
		System.out.println(count);
		

	}

}
