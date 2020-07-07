package pkg02;

public class IF01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// control = select + loop + sub control

		// selection : Control the order of the program ->if, switch-case

		// loop : while or for loop

		// break, continue, return

		// simple if
		// if else
		// nested if
		/**
		 * 
		 * 
		 * if(condition) {
		 * 
		 * } else if() {
		 * 
		 * } else {
		 * 
		 * }
		 * 
		 */

		int su = 9;
		// su odd?

		if (su % 2 == 1) {
			System.out.println("It is an odd number");

		} else
			System.out.println("It is an even number");

		// Q

		if (su % 3 == 0) {
			System.out.println("Yes");
		} else
			System.out.println("No");

		int score = 65;
		if (score > 60) {
			System.out.println("Passed");
		} else {
			System.out.println("Failled");
		}

		score = 75;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else
			System.out.println("F");

		
		IF01 temp = new IF01();
		System.out.println(temp.getScore(75));
		
		int month =5;
		//345 678
		if(month >=6 && month <=8)
		{
			System.out.println("Summer");  
		}
		else if (month >=3 && month <=5)
		{
			System.out.println("Spring");
		}
		else if(month <=11 && month >=9)
		{
			System.out.println("Fall");
		}
		else if(month >12)
		{
			System.out.println("오류");
		}
		else
		{
			System.out.println("Winter");
		}
		
		System.out.println(temp.getSeason(-1));
		
		System.out.println("----------------------------------------");
		
		int num =-1;
		
		if(num <= 0)
		{
			System.out.println("You put the wrong one");
		}
		else if(num % 5 ==0) {
			System.out.println("It is possible to divide by 5");
			
		} else if(num%5 !=0 && num > 0)
		{
			System.out.println("It is not possible to divide by 5");

		}
		else 
		
		System.out.println(temp.getFive(-5));
		
	}

	public String getFive(int num)
	{
		if(num % 5 ==0) {
			return "It is possible to divide by 5";
			
		} else if(num%5 !=0 && num > 0)
		{
			return"It is not possible to divide by 5";

		}
		else 
		{
			return "You put the wrong one";
		}
	
	}
	
	public String getSeason(int month) {
		
		if(month >=6 && month <=8)
		{
			return "Summer";
		}
		else if (month >=3 && month <=5)
		{
			return "Spring";
		}
		else if(month <=11 && month >=9)
		{
			return "Fall";
		}else if(month >12 ||month <0)
		{
			return "오류";
		}
		else
		{
		 return "Winter";
		}
	}
	
	
	
	
	
	public String getScore(int score)
	{
		
		if (score >= 90) {
			return "A";
		} else if (score >= 80) {
			return  "B";
		} else if (score >= 70) {
			return "C";
		} else if (score >= 60) {
			return  "D";
		} else
			return "F";
	}
}
