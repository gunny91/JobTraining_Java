package mypackage.main;

import mypackage.enumtest.PERSON_TYPE;
import mypackage.persom.Person;
import mypackage.persom.Staff;
import mypackage.player.DvdPlayer;
import mypackage.player.Player;

public class TotalMain04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person soo = new Staff("Kim",45,"YongSan","010-2222-3333",PERSON_TYPE.STAFF,"วเมค");
	System.out.println(soo);
	
	
	Player mydvd = new DvdPlayer("Avenger","Action, Drama","Director Kim");
	((Staff)soo).play(mydvd);
	}
}
