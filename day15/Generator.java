package pkg15;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Generator extends Thread{
	
	@Override
	public void run()
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		Set<Integer> keyVal = map.keySet();
		Random r = new Random();

			try {
				
				for(int i =1; i <= 100; i++)
				{
					Thread.sleep(100);
					int key = r.nextInt(10)+1;
					if(map.containsKey(key))
					{
						map.put(key, map.get(key)+1);
					}else
					{
						map.put(key, 1);
					}
				}
				Set<Integer> keylist = map.keySet();
				System.out.println(keylist);
				for(Integer key : keylist)
				{
					int value = map.get(key);
					System.out.println(key+"\t"+value);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}catch (Exception e){
				e.printStackTrace();
			}

			System.out.println("Job is done");

		}



}
