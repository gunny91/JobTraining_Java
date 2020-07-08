package pkg03;

import java.util.ArrayList;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int[] arr = new int[10];
		
		int[] a = new int[3];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		int count =0;
//		while(count < a.length)
//		{
//			a[count]= 10*(count+1); // y = ax+b -->> y = a*i+b
//			System.out.println(a[count]);
//			count++;
//		}
//		
//		
//		int arr[] = {10,20,30};
//		
//		for(int i =0; i < arr.length; i++)
//		{
//			System.out.println("arr["+i+"]= "+arr[i]);
//			
//		}
			// 1+4+7+...100 =;
			//+3
//		int[] b = new int[34];
//		//b[i] = 3*i+1;
//		int total =0;
//		for(int i =0 ;i < b.length;i++)
//		{
//			b[i] +=3*i+1;
//			total =b[i];
//			System.out.println("b["+i+"] "+b[i]);
//		}

		//System.out.println(total);
		//3, 8,13...98
//		int[] c = new int[20];
//		//c[i] +=5*i+3
//		
//		for(int i = 0; i < c.length; i++)
//		{
//			c[i] +=5*i+3;
//			System.out.println("c["+i+"] = "+c[i]);
//		}
//		
//		
		//Qd
		
//		int[] d = new int[92/10+1];
//		
//		for(int i=0; i<d.length; i++)
//		{
//			d[i] = -10*i+92;
//			System.out.println("d["+i+"]"+d[i]);
//			
//		}
		
//		ArrayList<String> car = new ArrayList<String>();
//		car.add("Hyon");
//		car.add("Kia");
//		car.add("Ford");
//		car.add("Toyota");
//		System.out.println(car);
//		System.out.println(car.get(0));
//		car.set(0, "MyNi");
//		System.out.println(car);
//		System.out.println(car.size());
//		
//		for(int i =0; i < car.size();i++)
//		{
//			System.out.println(car.get(i));
//		}
//		
//		
		
		int[] temp= {15,20,10,30,35};
		temp[0]=15;
		int evenCount=0;
		int oddCount=0;
		for(int i =0; i < temp.length; i++)
		{
			if(temp[i]%2==0)
			{
				evenCount++;
			}
			else
				oddCount++;
				
		}
		System.out.println("Even number Count-> "+evenCount);
		System.out.println("Odd number Count-> "+oddCount);
		
		int max=temp[0];
		int min = temp[1];
		for(int i =0;i<temp.length;i++)
		{
			if(temp[i]> max)
			{
				max = temp[i];
			}else if(temp[i] <min)
				min =temp[i];
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
		
		System.out.println("Absolute Value : "+Math.abs(temp[evenCount-oddCount]));
		
		int getResult =0;
		if(temp[evenCount]-temp[oddCount] > 0)
		{
			getResult = temp[evenCount]- temp[oddCount];
		}
		else
			getResult= -1*(temp[evenCount]- temp[oddCount]);
		
		
		System.out.println("Absolute Value : "+getResult);
		
		
		
		int[] x= new int[100];
		
		int c[] = {1,2,3,4,5};
		
		int total= 0;
		
		total = c[0];
		
		System.out.println(total);
		
		
		
		
		
		
		
		
		
	}

}
