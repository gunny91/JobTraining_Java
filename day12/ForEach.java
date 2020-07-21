package pkg12;

public class ForEach {

	/**
	 * to use it from Array or collection 
	 * 
	 */
	public static void main(String[] args) {
		
		int  arr[] = {10,20,30};
		
		
		for(int x : arr)
		{
			System.out.println(x);
		}
		
//		for(tpye name: name of array )
//		{
//			FIFO  first in first out
//		}
		System.out.println();
		
		String ni[] = {"ni","g","apple"};
		for(String x : ni)
		{
			System.out.println(x);
		}
		
	}

}
