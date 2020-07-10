package practice;

import java.util.Random;

public class Dice {

	/**
	 * This is string value of user name 
	 */
	private String name;
	
	/**
	 * This is the integer value of Dice number
	 */
	private int diceNum;
	
	/**
	 * This is the integer value that store the total sum of the each rolled dice values
	 */
	private int total;
	
	/**
	 * This is the random value generator
	 */
	private Random rand = new Random(); 
	
	/**
	 * This is the instance variable that store the random value
	 */
	private int getRand;

	
	/**
	 * This is the constructor to initiate the user name
	 * @param name
	 */
	public Dice(String name)
	{
		this.name = name;
		diceNum=5;
		total =0;
		
	}
	
	/**
	 * This is the constructor to get the name and number of roll counts
	 * @param name name of user
	 * @param num number of count of rolling dice
	 */
	public Dice(String name, int num)
	{
		this.name= name;
		this.diceNum=num;
		total =0;
		//this.getRand =0;
		
	}
	
	/**
	 * This is the void method to count the rolled dice values
	 */
	public void roll()
	{
		
		for(int i= 0; i < this.diceNum ; i++)
		{
			getRand= rand.nextInt(6)+1;
			total+=getRand;
			System.out.print(getRand+ " ");
		}
		
		
	}
	
	/**
	 * This is the integer total sum method to store the total sum of the each diec values
	 * @return
	 */
	public int total()
	{
		
		return total;
	}
	
	/**
	 * This is the void method to get the result of the game.
	 */
	public void getInfo()
	{
		System.out.println("Name : "+this.name);
		System.out.print("Dice values : ");roll();
		System.out.println("\ntotal : "+total());
		System.out.println("---------");
	}

}
