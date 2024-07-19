package javaSession;

import java.util.Scanner;

public class Maths {
	
	static Scanner SC = new Scanner(System.in);

    static int inputNumber(String message) {
        System.out.println(message);
        return SC.nextInt();
    }
    static long c;
	
    
    // Without Void keyword
    
	   public static long sum(long a, long b) {
		   c = a + b;
		   System.out.println("Sum of a+b =" );
		   return(c);
	   }

	   public void substruct(long a,long b) {
		   c = a - b;
		   System.out.println("Substruction of a-b =" + c);
	   }
	    
	   public void multiplication(long a,long b) {
		   c= a*b; 
		   System.out.println("Multiplaction of a*b =" + c);
			
		}

}
