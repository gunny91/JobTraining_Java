package pkg08;

public class RefCastingMAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book java = new
		Object java = new  Book("Java",1000,"Good");
//		Book C = new Book();
//		Book B = new Book();
		

//		Display(java);
//		String str = new String("Korea");
//		String str2 ="Fk"; // Up casting!!!!!!
		Object str = new String("Korea");
		Object str2 ="Fk";
 		
		Integer x = new Integer(100); //Constructor overLoading
		Display(java.toString());
		Display(str);
		Display(x);
		
	}



	private static void Display(Object obj) {
	
		//instanceof  : check that the class that weather it is instance or not it will return true or false
		//obj instanceof Book
		// check that the obj is made in Book class?
		
		if(obj instanceof Book)
		{
			Book mybook = (Book)obj; //down-casting
			System.out.println(mybook.toString());
		}
		else if(obj instanceof String)
		{
			String str = (String)obj; //down-casting
			System.out.println(str.toString());
		}
		else if(obj instanceof Integer)
		{
			Integer intt = (Integer)obj; //down-casting
			System.out.println(intt.toString());
			
		}
		else
		{
			return;
		}
		
//		System.out.println(obj);
	}

}
