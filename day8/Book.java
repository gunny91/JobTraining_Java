package pkg08;

public class Book {
	
	private String name;
	private double price;
	private String education;
	
	
	public Book(String name, int price, String edu) {
		this.name = name;
		this.price = price;
		this.education = edu;
	
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result ="";
		result += "Subject " + this.name +"\n";
		result += "Tuition " + this.price +"\n";
		result += "Education " + this.education +"\n";
		
		return result;
	}
	
	
	
}
