package pkg11;

public class MyExceptionExample {

	public static void main(String[] args) {
		int x =3;
		
		try {
				if(x <5)
				{
					//1. Call the constructor then generate the exception object
					//2. Using throw that can make the exception
					throw new LessThan5("Enter the bigger than 5");
				}
				else
				{
					System.out.println("Normal ");
				}
		}catch (LessThan5 e)
		{
			//e :call it exception's object
			System.out.println("You got less than 5");
			System.out.println("Message : "+e.getMessage()); // print the message to String
			System.out.println("String : "+e.toString()); //Can print out the exception information
			e.printStackTrace(); // trace out the exception 
		}

	}

}
