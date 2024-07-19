package ganeralIVQ;

public class ReverceStringWordByWord {

	public static String revstringWBW(String s) { // hello world -- olleh dlrow
		
		//String s2=  s.split(" ");
		String s1[]= s.split(" ");
		
		String rev= "";
		
		for (String e : s1) {
			rev = rev + ReverseString.revString(e)+ " ";
			}
		
		return (rev);
			
	}
	
	public static void main(String ar[]) {
		
		String s3= revstringWBW("Hello world");
		System.out.println(s3);
		
	}
}
