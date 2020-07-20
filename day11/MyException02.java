package pkg11;

import java.util.Scanner;

public class MyException02 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter First Integer");
			int x = scan.nextInt();
			
			System.out.println("Enter Second Integer");
			int y = Integer.parseInt(scan.next());	
			System.out.println(x/y);
		}
		catch (NumberFormatException e) //NumberFormatException it is ofeten appear at web programming
		{
			System.out.println("Cannot calcualte with String value to integer");
		}
		catch(ArithmeticException e)
		{
			System.out.println("You cannot divide it by 0");
		}	
		catch(Exception e) {System.out.println("Exception");}
		finally {
					scan.close();
		}
		
		String str = "hello Korea";
		int idx = str.indexOf("asdf");
		try {
				String temp = str.substring(0,idx);
				System.out.println(temp);
			}
		catch (StringIndexOutOfBoundsException e){
			System.out.println("Index out of bounds");
			
		}
		
		System.out.println(Integer.parseInt("1234"));
	

//		String xx ="aa";
//		first(xx);
		try {
				String xx ="aa";
				first(xx);
			}
			catch (ArithmeticException e ){System.out.println("This is wrong");}
			catch (NumberFormatException e) {System.out.println("Number format exception");}
			catch (Exception e) {System.out.println("You got the error!");}
	}
	
//throw excpetion : Throw it at upper stack
	//method () throws exception name
	//{}


public static void third() throws ArithmeticException, NumberFormatException {
	
	
	int i =1 ,j =0;
	System.out.println(i/j);
}

public static void second() throws ArithmeticException, NumberFormatException
{
	third();
	
}

public static void first(String xx) throws ArithmeticException, NumberFormatException
{
	int x = Integer.parseInt(xx);
	second();
	
}

}

