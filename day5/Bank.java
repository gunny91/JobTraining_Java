package pkg05;

public class Bank {
	/**
	 * Bank user name
	 */
	private String userName; 
	
	/**
	 * Bank name
	 */
	private static String bankName;
	
	/**
	 * Deposit
	 */
	private int deposit;
	
	/**
	 * Account number
	 */
	private int accountNum;

	
	/**
	 * This is the constructor to create the user name, bank name, deposit info, and account number
	 * @param uName User name
	 * @param bName Bank name
	 * @param depo Deposit
	 * @param account Account number
	 */
	public Bank(String uName,String bName, int depo,int account)
	{
		this.userName = uName;
		this.bankName =bName;
		this.deposit = depo;
		this.accountNum = account;
	}
	
	
	
	/**
	 * This is method to show the user information!
	 */
	public void getInfo()
	{
		System.out.println("Bank Branch : "+this.bankName);
		System.out.println("User Name : "+this.userName);
		System.out.println("Account Number : "+ this.deposit);
		System.out.println("Deposit : "+ this.accountNum);
		System.out.println("---------------");
		
		
	}
	
	
	
	
}
