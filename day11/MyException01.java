package pkg11;

public class MyException01 {

	/*
	 * 			Exception : 
	 * 			* Code or run time problems * Exception Class
	 * 
	 *			 Error : 
	 *			* Error Class 
	 *			* Cannot process or solve the problmes -->Occurs System
	 * 			  error, Shut off etc...
	 * 
	 * 			What can we use? 
	 * 			* try{Put the statement allows you to define a block of code to be tested for errors while it is being executed. } 
	 * 			* catch(Exceptione){Put the statement allows you to define a block of code to be executed, if an error occurs in the try block.} 
	 * 			* finally{Mainlu file close , DB un-connect etc}
	 *			
	 *			NullPointerException : when object is not refer to something, or null
	 */
	public static void main(String[] args) {
		int x = 3, y = 0;
		int arr[] = { 10, 20, 30 };
		String str = null;

		try 
		{
			System.out.println(str.length());
			arr[3] = 50;
			
			System.out.println(x / y);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("length is different");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("cannot divide by 0");
		} 
		catch (NullPointerException e)
		{
			System.out.println("Don't put the null at your String");
		}
		catch (Exception e)
		{
			System.out.println("Pretty much can cover every exceptions");
		}
		finally 
		{
			System.out.println("Done for work");
		}

		
//		try {
//			System.out.println(x / y);
//		} catch (ArithmeticException e) {
//			System.out.println("cannot divide by 0");
//		} finally {
//			System.out.println("Done for work");
//		}

	}

}
