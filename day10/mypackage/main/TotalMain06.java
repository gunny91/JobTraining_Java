package mypackage.main;

import mypackage.enumtest.PERSON_TYPE;
import mypackage.persom.Person;
import mypackage.persom.Staff;
import mypackage.persom.Teacher;
import mypackage.player.DvdPlayer;
import mypackage.player.Mp3Player;
import mypackage.player.Player;
import mypackage.sports.BaseBall;
import mypackage.sports.FootBall;
import mypackage.sports.Sports;

public class TotalMain06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person[] persons =
			{
					new Staff("Kim",10,"Mapo", "010-2222-3333",PERSON_TYPE.STAFF,"Management"),
					new Teacher("Park",20, "YongSan","010-4444-2222",PERSON_TYPE.TEACHER,"DATABASE"),
			};
					
			Player[] players=
			{
				new DvdPlayer("Avenger","Action, Drama","Director kim"),
				new Mp3Player("Some song",200)
			};
			
			Sports[] sports=
				{
						new FootBall("Soccer",11,5),
						new BaseBall("BaseBall",9, 0.315)
				};
			
			for (int i = 0; i < persons.length; i++) {
				persons[i].showData(players[i],sports[i]);
			}
			
			
					
					
			
		
	}

}
