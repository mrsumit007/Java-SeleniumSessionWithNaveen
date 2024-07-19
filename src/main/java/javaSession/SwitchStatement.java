package javaSession;

import java.util.Scanner;

public class SwitchStatement {
	
	// char, byte, short, int, String -- Allowed
	// long, double, float, -- Not Allowed
	// Range in Switch Case---- ex:- (10-20) -- Not Allowed
	
	// Use-Case
	// Cross browser
	// Multiple Environment
	// Role-Based Access Control (RBAC), ex;- Admin, seller, vender, partner, customer, category manager etc..
	// Payment Method : card, paypal, upi, bank etc
	

	public static void main(String[] args) {

		int Day;

		Scanner SC = new Scanner(System.in);
		System.out.println("Inter the Day in number format betwwen 1 to 7");
		Day = SC.nextInt();

		// Use-case to select gender.
		switch (Day) {
		case 1:
			System.out.println("Its Monday");
			break;
		case 2:
			System.out.println("Its Tuesday");
			break;
		case 3:
			System.out.println("Its Wednesday");
			break;
		case 4:
			System.out.println("Its Thrusday");
			break;
		case 5:
			System.out.println("Its Friday");
			break;
		case 6:
			System.out.println("Its Saturday");
			break;
		case 7:
			System.out.println("Its Sunday");
			break;
		default:
			System.out.println("Incorrect input");
			break;

		}
		
		// Use-case to select gender.

		char Gender = 'f';

		switch (Gender) {

		case 'f':
			System.out.println("Gender : f");
			break;

		case 'm':
			System.out.println("Gender: m");
			break;

		default:
			System.out.println("Incorrect format");

		}
		
		
		// Use- Case for Vowel char - a,e,i,o,u
		
		char ch = 'a';
		
		switch (ch) {
		case 'a':
			System.out.println( ch + " " +"is a vowel char");
			
			break;

		default:
			break;
		}
		
		String Browser = "Chrome   ";
		
		switch (Browser.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Lounch chrome browser");
			break;
		case "firefox":
			System.out.println("Lounch firefox browser");
			break;
		case "ie":
			System.out.println("Lounch ie browser");
			break;
		case "safari":
			System.out.println("Lounch safari browser");
			break;
		default:
			System.out.println("Please pass the correct Browser");
			break;
		}

	}

}
