package pkg06;

public class HealthInfo {

	public String name;
	public String blood;
	public String hobbies;
	public float hight;
	public float weight;
	
	
	public void disPlay()
	{
		System.out.println("Name : " + this.name);
		System.out.println("Bloode Type: "+ blood);
		System.out.println("Hight : "+ hight);
		System.out.println("Weight : "+ weight);
		System.out.println("Hobbies : "+hobbies);
		
		System.out.println("---------------------------");
	}
	
}
