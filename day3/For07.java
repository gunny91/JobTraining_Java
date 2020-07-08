package pkg03;

public class For07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String print ="";
		for(int i =0; i < 4; i++)
		{
			for(int j =0; j < i ; j++)
			{
				print+="*";
				System.out.print(print);
			}
			System.out.println();
		}

		
		//System.out.print(print);
	}

}
