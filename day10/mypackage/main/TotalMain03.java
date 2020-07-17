package mypackage.main;

import mypackage.enumtest.PERSON_TYPE;
import mypackage.enumtest.STUDENT_SCHOOLYEAR;
import mypackage.persom.Person;
import mypackage.persom.Staff;
import mypackage.persom.Student;
import mypackage.persom.Teacher;
import pkg08.Book;

public class TotalMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] person =
			{			
					new Student("Bar",30, "Samsung","010-444222-2323",PERSON_TYPE.STUDENT, STUDENT_SCHOOLYEAR.FRESHMAN,"A"),
					new Teacher("PArk",20,"YongSan","010-2222-2111",PERSON_TYPE.TEACHER,"DataBase"),
					new Staff("Choel",10,"Mapo","010-1111-2222",PERSON_TYPE.STAFF,"°ü¸®ºÎ")
			};
		for(int i=0; i< person.length;i++)
		{
			System.out.println(person[i]);
			System.out.println();
		}
		
		System.out.println("--------------Use instanceof------------------");
		
		for(int i =0; i <person.length;i++)
		{

			if(person[i] instanceof Student)
			{
				((Student)person[i]).learn("Java Programming");
			}else if(person[i] instanceof Teacher)
			{
				((Teacher)person[i]).teach();
				
			}
			else if(person[i] instanceof Staff)
			{
				((Staff)person[i]).work();
			}
		}
	
		
	}

}
