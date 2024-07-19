package stringManupulation;

import org.apache.poi.hslf.record.TextCharsAtom;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String s1 = "MADAM";
		
		for(int i=0; i<=s1.length()-1; i++) 
		{
			
			if (s1.charAt(i)== s1.charAt(s1.length()-1-i)) {
				System.out.println("String is palindrome");
			}
			
		}
		
			System.out.println("String is not Pallendrome");

	}

}
