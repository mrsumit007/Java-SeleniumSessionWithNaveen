package ganeralIVQ;

public class MatrixOprations {

	
//Matrix Operations: Implement basic matrix operations like addition, subtraction, and multiplication in Java.
	
	public static void sum(int a[][], int b[][]) {
		
		if(a.length != b.length || a[0].length!= b[0].length) {
			System.out.println("Provide matrix with correct dimention");
			return;
		}
		
		System.out.println("Addition of Matrix a and b");
		for(int i=0; i< a.length; i++) {
			for(int j= 0; j< b[0].length; j++) {
				
				a[i][j]= a[i][j] + b[i][j];
				System.out.println(a[i][j]);
				
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int ar1[][]	= new int[2][2];
		int ar2[][] = new int [2][3];
		
		ar1[0][0] = 5;
		ar1[0][1] = 9;
		ar1[1][0] = 3;
		ar1[1][1] = 2;
		
		ar2[0][0] = 9;
		ar2[0][1] = 6;
		ar2[1][0] = 3;
		ar2[1][1] = 1;
		
		ar2[0][2] = 3;
		ar2[0][2] = 1;
		
		
		MatrixOprations.sum(ar1,ar2);
		
		
	}

}
