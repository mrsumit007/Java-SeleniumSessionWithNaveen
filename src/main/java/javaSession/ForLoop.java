package javaSession;

public class ForLoop {

	public static void main(String[] args) {
	 // write a program for even number
		
		System.out.println("Even Number between 0 to 10");
		for (int i= 1; i <= 10; i++ ) {
			
			if(i%2==0) {
			System.out.println(i);
			}
		}
		System.out.println("=========================================================================");
		
		System.out.println("Even Number between 0 to 10");
		for (int i= 0; i <= 10; i=i+2 ) {
			
			System.out.println(i);
			
		}		
		

	}

}
