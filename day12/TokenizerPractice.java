package pkg12;

import java.util.StringTokenizer;

public class TokenizerPractice {

	public static void main(String[] args) {
		String str = "id=hong&password=1234&address=°ø´öµ¿&sdsdsd=sdsdddddddd";
		//String temp ="¡Ü";
		//StringTokenizer doIt = new StringTokenizer(str, temp);
		
		StringTokenizer st = new StringTokenizer(str,"&");
		StringTokenizer st2 ;
		while(st.hasMoreTokens())
		{
//			st2 = new StringTokenizer(st.nextToken(),"=");
//			System.out.println(st2.nextToken() +": "+st2.nextToken());
			System.out.println(st.nextToken().replace("=", ": "));	
		}
		
		
		
	}

}
