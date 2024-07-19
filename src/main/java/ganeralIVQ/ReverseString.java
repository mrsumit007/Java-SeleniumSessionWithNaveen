package ganeralIVQ;

public class ReverseString 
{
	
//String Reverse: Write a method that takes a string as an argument and returns the reverse version of that string.

	public static String revString(String s1) 
	{

// Handling null value
		try 
		{
			if(s1== null) 
			{
			System.out.println( "Please provide some value String can not be null");
			}
		} 
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		
// If Blank or empty value
		if (s1.isBlank() || s1.isEmpty()) {
			return(s1);
		}
		
// if single character
		if (s1.length()== 1) {
			return(s1);
		}
		
				
		System.out.println("Origional String  --> " + s1);
		int len= s1.length();
		String rev="";
		
		for(int i= len-1; i>=0; i--) 
		{
			rev = rev+ s1.charAt(i);
		}
		return(rev);
	}
	
	public static void main(String a[]) 
	{
		
		String s2 = revString("Hello");
		System.out.println("Reverce string  --> " + s2.toLowerCase());
		
		String s3= revString("t");
		System.out.println("Reverce string  --> " + s3);
		
		String s4= revString("Helo World");
		System.out.println("Reverce string  --> " + s4);
		
		String s5= revString("");
		System.out.println("Reverce string  --> " + s5);
		
		String s6= revString(null);
		System.out.println("Reverce string  --> " + s6);
		
		
	}
	
}
