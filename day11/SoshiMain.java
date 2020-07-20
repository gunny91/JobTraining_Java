package pkg11;

import java.util.Scanner;

public class SoshiMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] soshi = {"Hyeon", "Yuri","Sunny", "Yuna","Corona","China","Radioactive","Japan"};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = in.next();
		
		boolean isMember = false;
		
		for(int i = 0 ; i <soshi.length; i++)
		{
			if(name.equals(soshi[i]))
			{
				isMember = true;
				break;
			}
		}
			
		if(isMember)
		{
			System.out.println("You got the member's name!");
		}
		else 
		{
				try 
				{
					String message = name+" You put the wrong name!";
					throw new GirlException(message);
				}
				catch(GirlException e)
				{
					System.out.println(e.toString());
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
		}
		in.close();
	
	}

}
