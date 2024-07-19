package javaSession;

import java.util.Scanner;

public class NaveenAssignment {

//7.) Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//			Marks        Grade
//			91-100         AA
//			81-90          AB
//			71-80          BB﻿
//			61-70          BC
//			51-60          CD
//			41-50          DD
//			<=40          Fail

	public String Grade(int Marks) {

		String Grade = "  ";

		if (Marks >= 0 && Marks <= 40) {
			Grade = "Fail";
			System.out.println("<=40 " + "      " + Grade);
		} else if (Marks >= 41 && Marks <= 50) {
			// System.out.println("DD");
			Grade = "DD";
			// System.out.println("Marks--> " +Marks + " is in Grage"+ "-->" +Grade);
			System.out.println("<=40" + "      " + Grade);
		} else if (Marks >= 51 && Marks <= 60) {
			Grade = "BC";
			System.out.println("51-60 " + "      " + Grade);
		} else if (Marks >= 61 && Marks <= 70) {
			Grade = "BC";
			System.out.println("61-70 " + "      " + Grade);
		} else if (Marks >= 71 && Marks <= 80) {
			Grade = "BB";
			System.out.println("71-80" + "      " + Grade);
		} else if (Marks >= 81 && Marks <= 90) {
			Grade = "AB";
			System.out.println("81-90" + "      " + Grade);
		} else if (Marks >= 91 && Marks <= 100) {
			Grade = "AA";
			System.out.println("91-100 " + "      " + Grade);
		} else {
			System.out.println("Enter valid Marks --> Range --> Between 0 -100");
		}

		return (Grade);

	}

//	6. A person is eligible to vote if his/her age is greater than or equal to 18. 
//  Define a method to find out if he/she is eligible to﻿ vote. - return true/false

	public boolean eligibleToVote(int age) {
		if (age >= 18) {
			return (true);
		} else {
			return (false);
		}
	}
	
//	4. Define two methods to print the maximum and the minimum number respectively among three numbers.
	
	public void minMaxnumber(float a, float b, float c) {
		if(a>b && (a>c)) {
		System.out.println("a is gratest");
		}
		else if(b>c) {
			System.out.println("b is gratest");
		}
		else {
			System.out.println("c is gratest");
		}
	}

	public static void main(String[] args) {

//		System.out.println("Enter the markes between 1-100 to get the correct grade");
//		Scanner Sc = new Scanner(System.in);
//		int Marks= Sc.nextInt();
//		Sc.close();
//		
//		System.out.println("Marks      Grade");
//		NaveenAssignment obj = new NaveenAssignment();
//		obj.Grade(Marks);
//		
//		//String t = obj.Grade(Marks);
//		//System.out.println(t);	

//		System.out.println("============================================================================");
//
//		System.out.println("Enter the age to know whether you are eligible to﻿ vote or not");
//		Scanner Sc1 = new Scanner(System.in);
//		int age = Sc1.nextInt();
//		Sc1.close();
//
//		NaveenAssignment obj1 = new NaveenAssignment();
//		boolean flag = obj1.eligibleToVote(age);
//		if (flag) {
//			System.out.println("your age>= 18 -->  elegible to vote");
//		} else {
//			System.out.println("your age <18 -->  Not elegible to vote");
//		}
//		System.out.println("============================================================================");
		
//		Scanner Sc2 = new Scanner(System.in);
//		System.out.println("Enter the value of a");
//		float a =Sc2.nextFloat();
//		System.out.println("Enter the value of b");
//		float b =Sc2.nextFloat();
//		System.out.println("Enter the value of c");
//		float c =Sc2.nextFloat();
//		
//		Sc2.close();
//		
//		NaveenAssignment obj2 = new NaveenAssignment();
//		obj2.minMaxnumber(a, b, c);
//		System.out.println("============================================================================");	
		
		System.gc();
		byte j = 22;
		int k =788787877;
		System.out.println((long)k);
		
//		System.out.println("============================================================================");	
		
		
		
	}

}
