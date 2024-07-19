package ganeralIVQ;

public class ASCIIValye {

	public static void main(String[] args) {
		char c = 'c';
		byte i =(byte)c;
		System.out.println((byte)c);
		
		
		byte result= (byte) (i +3);
		System.out.println(result);
		
		char c2= (char)result;
		System.out.println(c2);
		
		int c3= c+3;
		System.out.println((char)c3);
		
		int j= 55;
		System.out.println(Math.pow(j, 2));
		
		System.out.println( ++j);
		
		int a=11, b=22, d;
		
		d = a + b + a++ + b++ + ++a + ++b; // 11+22+11+22+13+24
		System.out.println(d);
		
		
		System.out.println("a="+a);// 11 
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		
		int k=20;
		
		k = k++ - --k + ++k - k--;
		System.out.println("k =" +k);
		
		char x= 'u';
		int y= 'u';
		System.out.println(y);
		
	

		
		
		
		
	}

}
