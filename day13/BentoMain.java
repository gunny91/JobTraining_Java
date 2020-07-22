package pkg13;

import java.util.ArrayList;
import java.util.List;

public class BentoMain {

	public static void main(String[] args) {
		Ningen s = new Ningen("Kim","Mappo");
		
		String[] bancha = new String[] {"oden","kimchi","Salad"};
		Bento bendo = new Bento(s,"SomeBento",10000,bancha);
		
		List<Bento> list = new ArrayList<Bento>();
		list.add(bendo);
		list.add(new Bento(new Ningen("Park", "YongSan"),"JinBento",7000,new String[] {"Egg","Sea Weed","Small fish"}));
		
		Delivery(list);
	}

	private static void Delivery(List<Bento> list) {
		System.out.println("Bento Order Statement");
		System.out.println("Name/Address/BentoName/Price/Ban1/Ban2/Ban3");
		System.out.println("---------------------------------------------");
		
		for(Bento ben : list)
		{

			System.out.println(ben.getNingenName()+"/"+ben.getBentoName()+"/"+ben.getPrice()+"/"+ben.getBamChan());
		}
	
	}

}
