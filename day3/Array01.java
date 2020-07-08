package pkg03;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array
		
		/**
		 * store the data to the JVM 
		 * Data Type
		 * Integer
		 * int[] arr = new int[];
		 * Data-type[] + name = new + int[count];
		 * it is start from arr[0] to arr[end]
		 * arr[0] is as same as instance variable
		 * 
		 * arr.length to check the length
		 */
		
		int[] arr = new int[10];
		
		System.out.println("Length is "+arr.length);
		arr[0] = 1;
		arr[1] =2;
		arr[3]=4;
		arr[5]=8;
		arr[8] =arr[0]+arr[3];
		int temp = arr.length;
		System.out.println(temp);
		
		for(int i =0; i <arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	
		System.out.println();
		//Q
		
		int x =3;
		int y =5;
		
		int[] array = new int[4];
		
		array[0]= x-y+6;
		array[2]= array[0]+3;
		array[1]= array[0] +array[2];
		array[3]= x+array[0]-4;
		
		for(int i =0; i < array.length;i++)
		{
			System.out.println("arr["+i+"] = "+array[i]);
		}
		
		
		System.out.println("----------------");
		
		int arrar[] = {1,2,3,4,5};
		String APink[] = {"random", "As", "Pink", "Girl", "Group"};
		
		
		System.out.println(APink.length);
		for(int i =0; i < APink.length; i++)
		{
			
			System.out.println(APink[i]);
		}
		
		System.out.println(arrar[0]);
		/**
		 * How to generate the array?
		 * 
		 * new operator
		 * inti 
		 * 
		 * 
		 * 
		 */
		String AnotherG[] = {};
		String[] AnotherPink= {"Random","As","F"};
		for(int i =0; i <AnotherPink.length;i++)
		{
			System.out.println(AnotherPink[i]);
		}
	
	}

}
