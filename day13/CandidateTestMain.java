package pkg13;

import java.util.ArrayList;
import java.util.List;

public class CandidateTestMain {

	public static void main(String[] args) {
		
		PresidentCandidates c1 =	new PresidentCandidates("Moon","Retard Party",0.4);
		PresidentCandidates c2 =	new PresidentCandidates("Park","Han Party",99.1);
		PresidentCandidates c3 =	new PresidentCandidates("Noo","Retard Party",0.3);
		PresidentCandidates c4 =	new PresidentCandidates("Alra","Han Party",23.3);
		PresidentCandidates c5 =	new PresidentCandidates("Choo","Retard Party",0.2);
		PresidentCandidates c6 =	new PresidentCandidates("Kim","Han Party",40.2);
		
		List<PresidentCandidates> list = new ArrayList<PresidentCandidates>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		int x = 100;
		//list.add(x);
		//System.out.println(list.size());
		
		Display(list);
		
	}

	private static void Display(List<PresidentCandidates> list) {
		
		for(PresidentCandidates pre:list) {
			System.out.println();
			String temp="";
			temp+="Name : "+pre.getName()+"\nParty : "+pre.getParty()+ "\nRate : "+pre.getRates();
			System.out.println(temp);
		}
	}

}
