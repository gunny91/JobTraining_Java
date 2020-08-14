package practiceDay30;

import java.util.Scanner;


public class Fruits {
	
	
	public static void main(String[] args) 
	{
		
		
		System.out.println();
		
		AppleSeller seller1 = new AppleSeller();
		seller1.initialState(0,50,1500);
		
		OrangeSeller seller2 = new OrangeSeller();
		seller2.initialState(0,70,2000);
		
		Buyer buyer= new Buyer();
		
		Scanner in = new Scanner(System.in);
		int choice =0;
		int buyMoney=0;
		
		do {
			System.out.println("Select numbers among 1 2 3 ");
			choice =in.nextInt();
			
			//if(choice ==0) {System.out.println("End Program");in.close(); return;}
			
			if(choice !=3) {
				String fruit="";
				if(choice ==1) {System.out.println("Apple Selected"); fruit ="apple";}
				else if(choice ==2) {System.out.println("Orange Selected"); fruit="orange"; }
				System.out.println(fruit+"How much?");
				buyMoney = in.nextInt();
				
				if(buyMoney > buyer.myMoney) {buyer.showBuyResult();continue;}
			
			}
			
			switch(choice)
			{
				case 1: buyer.buyApple(seller1, buyMoney); seller1.showSaleResult(); buyer.showBuyResult(); break;
				case 2: buyer.buyOrange(seller2, buyMoney); seller2.showSaleResult(); buyer.showBuyResult(); break;
				case 3: buyer.showBuyResult(); break;
				case 0: System.out.println("System End"); in.close(); return;
				default: System.out.println("Please Reselect it");
			}
			
		}
		while(choice !=0);
		
		
		
	}
}

class AppleSeller{
	private int numApple; 
	private int getProfit; 
	int applePrice;
	
	public AppleSeller() {}
	
	public int saleApple(int money)
	{			
		int numCount = money / applePrice; //Get the number of apple's from money
		numApple-=numCount; //calculate the number of apple that left
		getProfit +=numCount *applePrice;
		
		return numCount;
	}
	
	public void showSaleResult()
	{
		System.out.println("Apple Saler");
		System.out.println("Left over apples : "+numApple);
		System.out.println("Sales Profits: "+getProfit);
		System.out.println();
	}
	
	public void initialState(int money, int appleCount, int price)
	{
		getProfit = money;
		numApple = appleCount;
		applePrice = price;
		
	}
} 

class OrangeSeller{
	private int numOrange; 
	private int getProfit; 
	int orangePrice;
	
	public int saleOrange(int money)
	{			
		int numCount = money / orangePrice; //Get the number of apple's from money
		numOrange-=numCount; //calculate the number of apple that left
		getProfit +=numCount *orangePrice;
		
		return numCount;
	}
	
	public void showSaleResult()
	{
		System.out.println("Apple Saler");
		System.out.println("Left over apples : "+numOrange);
		System.out.println("Sales Profits: "+getProfit);
		System.out.println();
	}
	
	public void initialState(int money, int appleCount, int price)
	{
		getProfit = money;
		numOrange = appleCount;
		orangePrice = price;
		
	}
	
	
}

 class Buyer{
	
	 int myMoney =10000;
	private int numApple =0;
	private int numOrange =0;
	
	public void buyApple(AppleSeller seller, int money)
	{
		int num = seller.saleApple(money);
		numApple +=num;
		myMoney -= num*seller.applePrice;
	}
	
	public void buyOrange(OrangeSeller seller, int money)
	{
		int num = seller.saleOrange(money);
		numOrange +=num;
		myMoney -= num*seller.orangePrice;
	}
	
	
	public void showBuyResult()
	{
		System.out.println("Fruits Buyer");
		System.out.println("Current Change : "+myMoney);
		System.out.println("Apple Count : "+numApple );
		System.out.println("Orange Count : "+numOrange);
		
	}
}