package pkg14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NestedMap {
	public static void main(String[] args) {
	
	Map<String, List<String>> map = new HashMap<String,List<String>>();
	List<String> mapKey1 = new ArrayList<String>();
	List<String> mapKey2 = new ArrayList<String>();
	List<String> mapKey3 = new ArrayList<String>();
	List<String> mapKey4 = new ArrayList<String>();
	
	mapKey1.add("Niga");
	mapKey1.add("Park");
	
	mapKey2.add("InS");
	mapKey2.add("InG");
	mapKey2.add("InK");

	mapKey3.add("Paris!!@");
	mapKey3.add("ParisDFDF");
	
	mapKey4.add("MGGGF");
	
	
	map.put("Republic", mapKey1);
	map.put("Korean Party", mapKey2);
	map.put("Libral Party", mapKey3);
	map.put("Justice Party", mapKey4);
	
	System.out.println(map);
	
	Set<String> keylist = map.keySet();
	System.out.println(keylist);
	
	for(String key:keylist)
	{
		List<String> getSome = map.get(key);
		//System.out.println(key+" = "+getSome);
		System.out.println(key+" List");
		for(String item :getSome) 
		{
			System.out.println(item);
		}
		System.out.println("--------------------------");
	
	}
	
	}
}
