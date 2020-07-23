package pkg14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Phone","1112222");
		map.put("Address","YongSan");
		map.put("Name","Hong Gill");
		map.put("Password","abc1234");
		System.out.println(map.keySet());
		
		Set<String> keylist = map.keySet();
		
		System.out.println(map.get("Phone"));
		
		for(String key : keylist)
		{
			String value = map.get(key);
			System.out.println(key+" = "+value);
		}
		
		System.out.println(map.size());
		
	}

}
