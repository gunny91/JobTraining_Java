package pkg14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		//Map<k,v> -->> Key, value 
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "SamSung");
		map.put(2, "Lotte");
		map.put(3, "KIA");
		map.put(4, "SK");
		map.put(4, "Lotte");
		
		System.out.println(map.size());
		
		System.out.println(map);

//		boolean isContains = map.containsKey(1);
//		System.out.println(isContains);
		boolean isThere = map.containsValue("Lotte");
		System.out.println("Lotte Check: "+isThere);
		System.out.println("KEy number 6 check : "+map.containsKey(6));
		System.out.println("Size : "+map.size());
		
		//Check if there is 5th if there is nothing, add LG
		
		if(map.containsKey(5)==false)
		{
			map.put(5, "LG");
		}
		
		String valu1 = map.get(3);
		System.out.println("Get Value: "+valu1);
		
		System.out.println(map);
		Set<Integer> keylist = map.keySet();
		
		for(Integer key : keylist)
		{
			String value = map.get(key);
			System.out.println("Key :"+key+" Value: "+value);
		}
		map.values();
		
		map.clear();
		
		/**
		 * 
		 */

	}

}
