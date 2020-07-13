package pkg06;

public class BankMain {

	public static void main(String[] args) {

	/**
	 	int[] accounts = new int[2];
		int user[] = {};
	 */

		//Set the 2 arrays
		BankAccount[] bAccount = new BankAccount[2];
		
		for(int i = 0 ; i < bAccount.length; i++)
		{
			bAccount[i]= new BankAccount();
			
			//System.out.println("What? "+ bAccount[i]);
			
		}
				bAccount[0].userName= "Ji";
				bAccount[0].accountNumber= 2940798;
				bAccount[0].balance= 3000000;
				
				bAccount[1].userName= "Joel";
				bAccount[1].accountNumber= 983088;
				bAccount[1].balance= 11000000;

			
				for (int i = 0; i < bAccount.length; i++) {
					bAccount[i].showResult();
				}
				
	}

}
