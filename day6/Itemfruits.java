package pkg06;

public class Itemfruits {

	private String name;
	private int price;
	private int stocks;
	private int soldCount;
	
	
	public Itemfruits(String name, int price, int stuck, int soldCount)
	{
		this.name = name;
		this.price = price;
		this.stocks = stuck;
		this.soldCount=soldCount;
		
	}
	
	public void showResult()
	{
		System.out.println("Name : " +name);
		System.out.println("Price : "+price);
		System.out.println("Stocks : "+stocks);
		System.out.println("Sold :" +soldCount);
	}
}
