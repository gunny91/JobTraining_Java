package mypackage.main;

import mypackage.enumtest.PERSON_TYPE;
import mypackage.enumtest.STUDENT_SCHOOLYEAR;
import mypackage.persom.Person;
import mypackage.persom.Student;

public class TotalMain02 {

	public static void main(String[] args) {
		Person soo = new Student("Kin",30,"Mapro","010-1111-2222",PERSON_TYPE.STUDENT,STUDENT_SCHOOLYEAR.SOPHOMORE,"A");
		
		System.out.println(soo);

	}

}
