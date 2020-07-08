package pkg03;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =1;
		int total=0;
		while(count<=10)
		{
			total+=count;
			
			count++;
		}
		System.out.println("Print Value "+ total);
	
		total=0;
		int countTemp =1;
		while(countTemp<=100)
		{
			total+=countTemp;
			countTemp+=3;
		}
		System.out.println(total);
		
		
		System.out.println("-----------");
		
		
		total=0;
		int numCount=1;
		
		while(numCount <=96)
		{
			
			total+= numCount*numCount;
			numCount+=5;
		}
		System.out.println(total);
		
		System.out.println("------------------");
		
		int num =3;
		int countNum =1;
		int getAnswer=0;
		while(countNum <=9)
		{
			System.out.println(3 +"*" + countNum +" = "+3*countNum);
			countNum++;
		}
		System.out.println();
		
		
		for(int i = 1; i <=9; i++)
		{
			for(int j =1; j<=9; j++)
			{
				System.out.println(i +" * "+j +"=" + i*j);
			}
			System.out.println();
		}
		
	}

	
	
}
