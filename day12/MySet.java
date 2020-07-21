package pkg12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {

	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		
		System.out.println(set.size());
		
		set.add("Hong");		
		set.add(1);
		set.add(false); //up-casting
		set.add(1);
		set.remove(1);

		set.clear();	
		
		set.add("Hong");		
		set.add(2);
		set.add(false); //up-casting
		set.add(1);
		System.out.println(set.contains("Lee"));
		if(!set.contains("Lee"))
		{
			set.add("Lee");
		}
		
		//set.toArray();
		set.remove(1);
		//System.out.println(set.);
		System.out.println(set.size());
		System.out.println(set);
		
		System.out.println();
		PrintSet(set);
		System.out.println();
		PrintFor(set);
		System.out.println();
		
		
		//Set A (1,2,3,4) || Set B (3,4,5,6)
		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();
		
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		
		setB.add(3);
		setB.add(4);
		setB.add(5);
		setB.add(6);

		Set<Integer> union = new HashSet<Integer>();
		
		union.addAll(setA);
		union.addAll(setB); // use addAll when we all adding several collections
		
		System.out.println(union);
		
		Set<Integer> intersection = new HashSet<Integer>(setA);
		
		intersection.retainAll(setB);
		System.out.println(intersection);
	
		Set<Integer> intersectionA = new HashSet<Integer>(setA);
		intersectionA.removeAll(setB);
		System.out.println(intersectionA);
		
		
		//1~10 integer add even number set
		Set<Integer> getEven = new HashSet<Integer>();
		Set<Integer> get3Times = new HashSet<Integer>();
		System.out.println();
		System.out.println("New");
		for(int i =1; i<=10; i++)
		{
			if(i%2==0)
			{
				getEven.add(i);
			}	
			
			 if(i%3==0)
			{
				get3Times.add(i);
			}
		}
//		System.out.println(getEven);
//		System.out.println(get3Times);
		
		Set<Integer> uni = new HashSet<Integer>();
		uni.addAll(getEven);
		uni.addAll(get3Times);
		System.out.println(uni);
		
		
		Set<Integer> intersep = new HashSet<Integer>(getEven);
		
		intersep.retainAll(get3Times);
		System.out.println(intersep);
		Set<Integer> intersep2 = new HashSet<Integer>(getEven);
		
		intersep2.removeAll(get3Times);
		System.out.println(intersep2);
		
		
		
		
		
	}

	private static void PrintFor(Set<Object> dataset) {
		System.out.println("\nExpand For used ");
		
		for(Object obj : dataset)
		{
			System.out.print(obj +" ");
		}
		
		
	}

	private static void PrintSet(Set<Object> dataset) {
		System.out.println("Iterator Interface used ");
		
		Iterator<Object> iterator =dataset.iterator();
		
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
			
		}
		

	}

}
