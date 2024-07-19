package javaSession;

import java.util.Scanner;

public class NestedIfElseStatement {

	Scanner SC = new Scanner(System.in);
	int Score = SC.nextInt();

	public static void main(String[] args) {

		System.out.println("Programe is to Print the Grade");

		System.out.println("Enter the Markes in range of 1 to 100");
		NestedIfElseStatement obj = new NestedIfElseStatement();

		// boolean flag= true;
		// If statement only run the body code if the condition is true
			if (true) {
			System.out.println("True");
			}
			// Dead code- never execute the statement
				else {
					System.out.println("False");
				}
		
		
			if (obj.Score <= 100) {

				if (obj.Score == 100) {
					System.out.println("You are elegible for Scloreship");
				}
					if (obj.Score >= 90 && obj.Score <= 100) {
						System.out.println("Grade A");
					}
						if (obj.Score >= 70 && obj.Score < 90) {
							System.out.println("Grade B");
						}
						if (obj.Score >= 50 && obj.Score < 70) {
							System.out.println("Grade C");
						}
							if (obj.Score < 50) {
								System.out.println("Fail");
							}
						}
							// else statement come in conjunction with if statement
			else {
			System.out.println("Markes enter is not in the correct range");
		}

		String Browser = "InternetExplore";

		if (Browser.trim().toLowerCase().equals("chrome")) {
			System.out.println("Lounch Chrome Browser");
		}
			else if (Browser.trim().toLowerCase().equals("firefox")) {
			System.out.println("Lounch FireFox Browser");
			}
				else if(Browser.trim().toLowerCase().equals("internetexplore")) {
					System.out.println("Lounch InternetExplore");
				}
					else if(Browser.trim().toLowerCase().equals("safari")) {
					System.out.println("Lounch safari");
					}
		
					else {
						System.out.println(Browser + "-->" + " is a Invalid Browser");
					}
		
		}
}

