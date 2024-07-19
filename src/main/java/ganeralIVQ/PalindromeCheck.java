package ganeralIVQ;

public class PalindromeCheck 
{
	
	public static boolean Palindrome(String s) 
	{
		s.toLowerCase().trim();
		int len = s.length();
		System.out.println(len);
	
		
		for(int i=0; i<len/2; i++) 
		{
			
			if(s.charAt(i)== s.charAt(s.length()-1-i))
			{
				System.out.println("String  " + " '  " +s + " '  "+ "  is  palindrome");
				return(true);
			}
		}
		
		System.out.println("String  " + " '  " +s + " '  "+"  is  not palindrome");
		return(false);
		
		
	}

	public static void main(String[] args) {
		
		boolean b = Palindrome("racecar");
		System.out.println(b);

	}

}
