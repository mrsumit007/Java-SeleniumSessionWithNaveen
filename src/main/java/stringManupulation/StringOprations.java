package stringManupulation;

public class StringOprations {

	public static void main(String[] args) {
		
		
		String s3 = "JAVA_PYTHON_JAVASCRIPT_RUBY";
		String T[] = s3.split("_"); //
		System.out.println(T[2]); // JAVASCRIPT
		
		String s1 = "abmin";
		String s2 = "this is my java code and i am so happy";

		s1.trim();
		
		char t= s1.charAt(3);
		System.out.println(t);
		//s1.charAt(-1);//StringIndexOutOfBoundsException
		
		int i = s1.length();//
		System.out.println(i);
		
		String s4= s1.replace("a", "X");
		System.out.println(s4);
		
		//replace:
		String dob = "01-01-1990"; 
		System.out.println(dob.replace("-", "/")); //01/01/1990
		
		String me = "welcome admin";
		System.out.println(me.replace("admin", "seller"));

	}

}
