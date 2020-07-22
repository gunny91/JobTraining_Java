package pkg13;

public class Bento {
private Ningen ningen;
private String bentoName;
private int price;
private String[] bancha = new String[3];
	
	public Bento(Ningen nin, String bentoName, int price, String[] bancha) {
		ningen = nin;
		this.bentoName = bentoName;
		this.price =price;
		this.bancha = bancha;
	}
	
	public Ningen getNingenName()
	{
		
		return ningen;
	}
	
	public String getBentoName()
	{
		return bentoName;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public String getBamChan()
	{
		String temp= "";
		for(int i =0; i < bancha.length;i++)
		{
			temp+=bancha[i]+"/";
		}
		return temp;
	}
	
	public String toString()
	{	
		String temp ="";
		temp +=ningen.getName();
		return temp;
	}

}
