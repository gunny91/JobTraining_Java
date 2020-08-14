package practiceDay29;

public class practice03 {

	public static void main(String[] args) {
		
		int count = 0;
		int sum=0;
		while(true)
		{
			if(count%2==1){sum+=count;}
			else if(count%2==0){sum+=-count;}
			if(sum>= 100){ System.out.println(count);break;}
			count++;
		}
//		
//		
		sum=0;
		for(int i =1;;i++)
		{
			if(i%2==1){sum+=i;}
			else if(i%2==0){sum+=-i;}
			if(sum >=100) {System.out.println(i); break;}
			
		}
		int num=0;
		int s =1;
		for(int i =1;;s=-s,i++)
		{
			num +=s*i;
			sum+=num;
			if(sum >=100) break;
		}
		
		
//		for(int i =1;sum>=100;s=-s,i++)
//		{
//			num +=s*i;
//			sum+=num;
//		}
//		System.out.println(num);
	}	

}
