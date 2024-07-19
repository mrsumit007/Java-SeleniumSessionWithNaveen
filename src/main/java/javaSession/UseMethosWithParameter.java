package javaSession;

import java.util.Scanner;

public class UseMethosWithParameter 
{

	public static void main(String[] args) 
	{
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the Name" );
		String Name = SC.nextLine();
		
		
		UseMethosWithParameter ClassObj = new UseMethosWithParameter();
		String s = ClassObj.student(Name);
		System.out.println(s);
			
	}
		
	public String student(String Name) {
	    System.out.print("My Name is : " );
	    return Name;
	    	}


}

