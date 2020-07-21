package pkg12;

public class ATM implements Runnable{

	private int balance;
	public ATM(int inputMoney) {
		this.balance=inputMoney;
		System.out.println("First amount : "+this.balance);
	}

	@Override
	public void run() {
		for(int i =0; i < 10 ; i++)
		{
			try {
					Thread.sleep(1000);
					int randMoney = (int)(100*Math.random());
					if(this.balance >= randMoney && randMoney !=0)
					{
						withdraw(randMoney);
					}
					else
					{
						
						System.out.println(Thread.currentThread().getName()+" "+randMoney+"Failed");
						System.out.println("Out of balance!!!");
						System.out.println("Current balance"+ this.balance+" Request withdraw amout : " +randMoney);
					}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			
		}
		
	}
	
	/**
	 * With draw method
	 * @param money
	 */
	public void withdraw(int money)
	{
	
		this.balance-=money;
		String temp = Thread.currentThread().getName()+" Money "+money;
		System.out.println(temp);
	}

}
