package pkg13;

import java.util.ArrayList;
import java.util.List;

public class GradeTest {

	public static void main(String[] args) {
		List<Grade> list = new ArrayList<Grade>();
		
		list.add(new Grade("Kim",1,3,30,40,50));
		list.add(new Grade("Park",1,4,70,80,90));
		list.add(new Grade("H",1,5,40,50,60));
		
		Display(list);
		
	}

	private static void Display(List<Grade> list) {
		System.out.println("Name\tGrade\tClass\tKor\tEng\t Math \t Total\t Avg");
		
		for(Grade g : list)
		{
			int total = g.getM()+g.getK()+g.getE();
			double avg = total/3;
			System.out.println(g.getname()+"\t"+g.getNum()+"\t"+g.getC()+"\t"+g.getK()+"\t"+g.getE()+"\t"+g.getM()+"\t"+total+"\t"+avg);
		}
	
	}

}
