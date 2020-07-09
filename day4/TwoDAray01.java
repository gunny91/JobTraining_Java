package pkg04;

public class TwoDAray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[2][3];
		
		
		int temp[][] = { {5,2,4},
						 {7,3,8}  };
		
		
		
		
		
		for(int i =0; i<temp.length; i++)
		{
			for(int j =0; j <temp[i].length; j++)
			{
				System.out.print(" "+temp[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		int y =3;
		int x[][] = new int[2][3];
		
		x[1][1]= 3;
		x[0][1] =x[1][1]+2-y;

		x[0][0]= 5;
		x[0][2]= 4;
		x[1][0]= 7;
		x[1][2]= 8;
		
		for(int i =0; i <x.length; i++)
		{
			for(int j= 0; j<x[i].length; j++)
			{
				System.out.println("arr["+i+"]"+"["+j+"]"+ "= "+x[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		int x1 =3;
		arr[1][1]=3;
		arr[0][1]=arr[1][1]+2-x1;

		for(int i =0; i <arr.length; i++)
		{
			for(int j = 0; j <arr[i].length ; j++)
			{
				System.out.println("arr["+i+"]"+"["+j+"]"+ "= "+arr[i][j]);
			}
			System.out.println();
		}

		
		int extra[][] = {{1,2,3}, {4,5}};
		
		for (int i = 0; i < extra.length; i++) {
			for (int j = 0; j < extra[i].length; j++) {
				System.out.println("extra["+i+"]"+"["+j+"]"+"= "+extra[i][j]);
				
			}
			System.out.println();
		}
	}

}
