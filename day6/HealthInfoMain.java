package pkg06;

public class HealthInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HealthInfo[] heal = new HealthInfo[2];
		
		for(int i = 0; i < heal.length; i++) {
			heal[i] = new HealthInfo();
		}
		
		heal[0].name = "Ji";
		heal[0].weight= 50;
		heal[0].hight = 190;
		heal[0].blood="AB";
		heal[0].hobbies="Beathing";
		

		heal[1].name = "Joel";
		heal[1].weight= 90;
		heal[1].hight = 180;
		heal[1].blood="O";
		heal[1].hobbies="Coding";
	
		for (int i = 0; i < heal.length; i++) {
			heal[i].disPlay();
		}

	}
}
