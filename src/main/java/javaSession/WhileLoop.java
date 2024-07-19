package javaSession;

public class WhileLoop {

	public static void main(String[] args) {
		
		int j=0;
		while( j<=5) {
			System.out.println(j);
			j++;
		}
		System.out.println("=============================================================================");
		System.out.println("Even Number");
		int i=0;
		while (i <= 10 ) {
			System.out.println(i);
			i=i+2;
		}
		System.out.println("=============================================================================");
		int k = 1;
        System.out.println("Even numbers between 1 and 20:");
        while (k <= 20) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        }

		
			
	}
	
}
