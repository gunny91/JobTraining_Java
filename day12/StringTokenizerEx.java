package pkg12;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	/*
	 * Cut the String to token
	 * Token : small piece of String
	 * delimiter : key for divide the string
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		StringTokenizer sToken = new StringTokenizer("Korea Ameria Japan");
		
		System.out.println(sToken.countTokens());
		while(sToken.hasMoreTokens())
		{
			String temp =sToken.nextToken();
			System.out.println(temp);
		}
		
		System.out.println("\n2. delimiter");
	StringTokenizer st = new StringTokenizer("Korea#Ameria#Japan"," #");
		
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			String temp =st.nextToken();
			System.out.println(temp);
		}

		System.out.println("\n3. delimiter");
		StringTokenizer st2 = new StringTokenizer("Korea#Ameria#Japan","#",true);
		
		System.out.println(st2.countTokens());
		while(st2.hasMoreTokens())
		{
			String temp =st2.nextToken();
			System.out.println(temp);
		}

		

	}
	
	
	
}
