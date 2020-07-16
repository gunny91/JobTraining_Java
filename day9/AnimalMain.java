package pkg09;

import java.util.Calendar;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animal = new Animal[3];
		
		
		animal[0] = new Lion("Lion", "Africa");
		animal[1] = new Eagle("Eagle", "Sky");
		animal[2] = new GoldFish("GoldFish", "River");
		
		for(int i = 0 ; i < animal.length; i++)
		{
			animal[i].move();
			
		}
		
		// Animal a = new Animal(); Abstract class cannot generate the instance 
		//however, it is possible to use reference type change thing
		Animal a = new Lion("Lion", "Africa"); //up-casting
		//Lion b = new Animal(); // cannot do the down-casting! 
		
		// Calendar class is the abstract class
		
		
		
		//Ananimous inner type
		Animal ab = new Animal(){
					@Override
					public void move()
					{
						Calendar c =  Calendar.getInstance(); ;
						System.out.println("The Current Date is:" + c.getTime()); 
					}
		};
		
		ab.move();
	}

}
