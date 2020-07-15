package pkg08;

public class PersonTest {

	public static void main(String[] args) {
		Person[] person= {
			new Student("Kim", 30, "Jisanro", "0104011222",3,2,"A"),
			new Teacher("Park",40, "yongSan", "01033334444",2,"Java"),
			new Staff("Choi", 50, "Gannam", "01055556666", 1, "Somewhere")	
		};
		
	
	
				
		for(int i = 0 ; i< person.length;i++)
		{
			System.out.println();
			System.out.println(person[i]);
		}
	}
	
	

}
