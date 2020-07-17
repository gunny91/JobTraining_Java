package pkg10;

import pkg10.EnumType.ShoseType;

public class Shose {

	
	String name;
	int size;
	ShoseType shoseT;
	ShoseTypeName sTN;
	public Shose(String name, int size, ShoseType running) {
	
		this.name = name;
		this.size = size;
		this.shoseT=running;
	}

	public Shose(String name, int size, ShoseType running, ShoseTypeName running2) {
		this.name =name;
		this.size =size;
		this.shoseT = running;
		this.sTN = running2;
	}

	public void showResult() {
		
		System.out.println("Brand:"+this.name+ "\nSize: "+this.size+"\nType : "+this.shoseT +"\nKR : "+this.sTN.getName());
		
	}

}
	

