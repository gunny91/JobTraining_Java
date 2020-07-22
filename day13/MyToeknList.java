package pkg13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class MyToeknList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MBC KBS SBS";
//		String[] tokens = str.split(" ");
		StringTokenizer st = new StringTokenizer(str," "  );
		
		String[] arr = new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreTokens())
		{
			arr[i] = st.nextToken();
			i++;
		}
		
		List<String> list = new ArrayList<String>();
		
		for(int j=0; j < 3; j++)
		{
			list.add(arr[j]);
		}
		
		//		List<String> list = new ArrayList<String>(Arrays.asList(tokens));
		System.out.println(list);

		//		list.add(arr);
		
	}

}
