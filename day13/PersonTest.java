package pkg13;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("Kim",30,40,50);
		Person p2 = new Person("Park",70,80,90);
		Person p3 = new Person("Hong",40,50,60);
		
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		PrintList(list);
		System.out.println();
		PrintFor(list);

	}

	private static void PrintFor(List<Person> list) {
		
		String temp ="Name\tKor\tEng\tMath\t\n";
		for(Person p : list)
		{
			temp+= p.getName()+" \t"+p.getKor()+" \t"+p.getEng()+" \t"+p.getMath()+" \n";
			
		}
		System.out.println(temp);
	}

	private static void PrintList(List<Person> list) {
		System.out.println("Name &total score & average ");
		int total=0;
		double avg=0.0;
		for(Person p : list)
		{
			 total =p.getKor()+p.getEng()+p.getMath();
			 avg = total/list.size();
			System.out.println(p.getName()+ "\t"+total+"\t"+avg+"\t");
		}

	}

}
