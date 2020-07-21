package pkg12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class LottoTest {

	
	public static void main(String[] args)
	{
		//Lotto num =6;
		Set<Integer> lotto = new HashSet<Integer>();
		Random r = new Random();
		int secondNum =0;
		
		while(lotto.size() <7)
		{
			int rand = r.nextInt(45)+1;
			lotto.add(rand);
			
			if(lotto.size() ==6)
			{
				secondNum = rand;
				
			}
			lotto.add(secondNum);
		}
		lotto.remove(secondNum);
		
		
		
		Object[] obj = lotto.toArray();
		Arrays.sort(obj);
		
		System.out.println("1st Lotto number");
		for(Object num : obj)
		{
			System.out.print(num+ "\t");
		}
		System.out.println();
		System.out.println();
		System.out.println("Second Number "+secondNum);
		
	}
}
