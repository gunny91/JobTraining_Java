package pkg14;

import java.util.Enumeration;
import java.util.Properties;

/**
 * 
 * Handle the Property class (only String) 
 * @author Geonhee Cho
 *
 *	Java     	 Web(JSP)
 *	variable  	 property
 *
 *
 */
public class PropertiesEx {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.put("ID", "Hong");
		prop.put("Name", "Hong GillDong");	
		prop.put("Password", "12345");
		prop.put("Address", "Gannam Style");
		prop.put("Zipcode", "12345-12345");
		
		System.out.println("Num size : "+prop.size());
		System.out.println(prop.getProperty("Name"));
		//System.out.println(prop);
		if(prop.getProperty("hphone")==null)
		{
			prop.put("hphone", "010404010430401");
		}
		
		if(!prop.contains("hphone"))
		{
			prop.put("hphone", "010404010430401");
		}
		System.out.println(prop);
		
		Enumeration<Object> en = prop.keys();
		while(en.hasMoreElements())
		{
			Object pro = en.nextElement();
		//	System.out.println("Print prooooo");
			System.out.println(pro);
			String key = (String)pro;
			String value = prop.getProperty(key);
			System.out.println();
			System.out.println(pro +" = "+value );
		}
		
		System.out.println(prop.toString());
		System.out.println();
		prop.list(System.out);
	}

}
