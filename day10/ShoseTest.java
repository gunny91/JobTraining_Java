package pkg10;

import pkg10.EnumType.ShoseType;

public class ShoseTest {

	public static void main(String[] args) {
		ShoseType myShose = ShoseType.WALKING;
		System.out.println(myShose);
		System.out.println();
		//DaysOfWeekEnum day : DaysOfWeekEnum.values()
		
		Shose sh1 = new Shose("NIKE", 260, ShoseType.RUNNING, ShoseTypeName.RUNNING);		
		sh1.showResult();
		
		
		
		System.out.println();
		
		for(ShoseType myS : ShoseType.values() )
		{
			System.out.println(myS);
		}
		
		for(ShoseTypeName myS : ShoseTypeName.values() )
		{
			System.out.println(myS.getName());
		}
		
		//Can find specific value
		ShoseType myT = ShoseType.valueOf("RUNNING");
		
//		try
//		{
//			ShoseType myT = ShoseType.valueOf("ABC");
//		}
//		catch(Exception e)
//		{
//			
//		}
		System.out.println();
		System.out.println(myT);
		
		ShoseType[] print = ShoseType.values();
		for(int i =0; i < print.length;i++)
		{
			System.out.println(print[i]);
		}
		System.out.println();
		
	}

}
