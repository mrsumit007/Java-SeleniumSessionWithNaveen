package ganeralIVQ;

public class Factorial {
	
// 5! = 1*2*3*4*5
	
	public void fact(int num) {
		
		System.out.println("Factorial of Number  " + num);
		int fact=1;
		for(int i =1; i <=num; i++) {
			fact = fact * i;
			
		}
		System.out.println(fact  );
		
	}

	public static void main(String[] args) {

		Factorial obj1 = new Factorial();
		obj1.fact(5);
	}

}
