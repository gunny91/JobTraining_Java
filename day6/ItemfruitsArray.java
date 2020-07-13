package pkg06;

import java.util.Scanner;

public class ItemfruitsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Itemfruits item = new Itemfruits("Joel",1,2,3);
//	
		Itemfruits[] item = new Itemfruits[2];
		
		
		//Scanner object "in"
		Scanner in = new Scanner(System.in);
		
		
		
		
		for (int i = 0; i < item.length; i++) {
			System.out.println("Item name : ");
			String putName = in.next();
			System.out.println("Item price : ");
			int price = in.nextInt();
			System.out.println("Item stock : ");
			int stock = in.nextInt();
			System.out.println("Item sold : ");
			int sold = in.nextInt();
			
			item[i] = new Itemfruits(putName,price,stock,sold);
			System.out.println();
		}
		
	
		for (int i = 0; i < item.length; i++) {
			item[i].showResult();
			System.out.println("-------------");
		}
		
	}
	
	
}
