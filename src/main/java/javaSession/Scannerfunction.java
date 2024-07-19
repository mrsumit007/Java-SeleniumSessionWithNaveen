package javaSession;

import java.util.Scanner;

public class Scannerfunction {
	public static void main(String[] arags) {
	
		double a,b, Sum;
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter Name");
		String Name = SC.nextLine();
		System.out.println(Name);
		
		// Addition of Two Number i.e a+b
		
		System.out.println("Enter 1st Number i.e value of a");
		a= SC.nextDouble();
		
		System.out.println("Enter 2nd Number i.e. value of b");
		b= SC.nextDouble();
		
		System.out.println("Sum of a and b = " + (Sum= a+b) );
		System.out.println("================================================");
		
		SC.close();
		// If else Condition
		if(Sum > 10){
			System.out.println("Sum is greater then 10");
						
		}
		else {
			System.out.println("Sum is less then 10");
		}
		
	
	}

}
