package pkg02;

import java.util.Random;

public class SwitchCase {

	public static void main(String[] args) {
		
		/**
		 * switch(function){
			case something1:
				excution1;
				break;
		  	case something 2:
		  		ecvuation2;
		  		break;
		  	default:
		  	...
		  }
		 */
	//Dies 1~6
		int dies=4;
		
		switch(dies) {
		case 1:
			System.out.println("You got the right value 1");
			break;
		case 2:
			System.out.println("You got the right value 2");
			break;
		case 3:
			System.out.println("You got the right value 3");
			break;
		case 4:
			System.out.println("You got the right value 4");
			break;
		case 5:
			System.out.println("You got the right value 5");
			break;
		case 6:
			System.out.println("You got the right value 6");
			break;
		}
	
		
		System.out.println("------------------------------------------------");
		
		
		
		switch(dies)
		{
		case 1:
		case 3:
		case 5:
			System.out.println("Odd");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("Even");
			break;
		}
		
		int score =100;
		
		switch(score/10)
		{
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
				
		}
		
		
		//if & switch
		// control the program's 분기?
		
		/**
		 * 
		 *			          if         switch
		 * Distinguish		관계연산		 value (character, number)
		 * 					Infinite	 specific number
		 * 
		 */
		
		
		
		Random r = new Random();
		int season =r.nextInt(12)+1;
		switch(season){
			case 12:
			case 1:
			case 2:
				System.out.println(season+ "월 겨울");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(season+ " 봄");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(season+ " 여름");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(season+ " 가을");
				break;
		}
		
		System.out.println("--------- Q2 , Q3, Q4 ---------");
		int num;
		num =-5+3 * 10/2;
		System.out.println(num);
		
		System.out.println("------");
		num =10;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(--num);
		
		System.out.println("------");
		
		int num1=10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 >10) && (num2>10));
		System.out.println(result);
		result = ((num1 >10) || (num2>10));
		System.out.println(result);
		System.out.println(!result);
		
		System.out.println("------------Q5 , Q6, Q7----------");
		
		
		System.out.println("-------------------------------");
		int i = (int)3.14;
		System.out.println(i);
		
		
		System.out.println("p106");
		
		int level = r.nextInt(5)+1;
		
		switch(level) {
			case 5:
				System.out.println(level + "층 헬스클럽 입니다");
				break;
			case 4:
				System.out.println(level + "층 치과 입니다");
				break;
			case 3:
				System.out.println(level + "층 피부과 입니다");
				break;
			case 2:
				System.out.println(level + "층 정형외과 입니다");
				break;
			case 1:
				System.out.println(level + "층 약국 입니다");
				break;
		
		}
		
	
	}

	
}
