package mypackage.main;

import mypackage.enumtest.PERSON_TYPE;
import mypackage.persom.Person;
import mypackage.persom.Teacher;
import mypackage.sports.FootBall;
import mypackage.sports.Sports;

public class TotalMain05 {

	public static void main(String[] args) {
	
		
		Person park = new Teacher("Park",45,"YongSan","010-1111-4444",PERSON_TYPE.TEACHER,"Java");
		System.out.println(park);
		
		Sports sport = new FootBall("Soccer",10,5);
		((Teacher)park).play(sport);
		
		
	}
	
	
	
}
