package pkg13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		
		list.add("Binga");
		list.add("Shiba");
		list.add("Inu");
		list.add("FX");
		list.add("Shiba");
		
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println();
//		int indx =list.indexOf("Nigga in Paris");
//		System.out.println(indx);
		int find = list.lastIndexOf("Shiba");
		System.out.println(find);
		
		String xy = "girls";
		System.out.println(list.indexOf(xy));
		
		list.add(2, xy);
		
		
		System.out.println();
	
//	Object[] temp = list.toArray();
//		
//		
//		for(Object x : temp)
//		{
//			System.out.println(x);
//		}
//		System.out.println(list);
//		System.out.println(list.size());
//		
//		
	
		list.set(5, "China");
		
		list.remove(3);
		ArrayList<String> list2 = new ArrayList<String>();
		System.out.println("Order sort");
		list2.add("x");
		list2.add("y");
		list2.add("z");
		list2.add("n");
	
//		PrintGet(list);
//		PrintFor(list);
		//PrintList(list2);
		Collections.sort( list2);
		System.out.println(list2);

		List<Object> newList = list.subList(2, 4);
		System.out.println(newList);
		//list.subList(newList.subList(0,1), 4);
		
		
		System.out.println();
		System.out.println("Reverse order");
		Collections.sort(list2,Collections.reverseOrder());
		System.out.println(list2);
		
		
		System.out.println("Random Order");
		Collections.shuffle(list2);
		System.out.println(list2);
		
		
	}

	private static void PrintList(List<Object> list) {
		System.out.println("Iterator Interface");
		Iterator<Object> temp = list.iterator();
		while(temp.hasNext())
		{
			System.out.print(temp.next()+"\t");
		}
	}

	private static void PrintFor(List<Object> list) {
		System.out.println("For each Statement");
			
		
		for(Object x :list.toArray() )
		{
			System.out.print(x+"\t");
		}
			

		
	}

	private static void PrintGet(List<Object> list)
	{
		System.out.println("Get moethod");
		for(int i =0; i< list.size();i++)
		{
			String x = (String)list.get(i);
			System.out.println(x);
		}
	}
	
}
