package stringManupulation;

public class StringBulderStringBuffer {

	public static void main(String[] args) {
		
		String s1= "hello";
		System.out.println(s1);
		
		// StringBuilder is faster then SringBuffer
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("World"); // new value of sf HelloWorld
		System.out.println(sb);
		
		StringBuffer sf = new StringBuffer("Hrllo");
		sf.append("HI"); // new value of sf HrlloHI
		System.out.println(sf);
		
		
		
	}

}
