package ganeralIVQ;

public class OddNumber {

	public static void main(String[] args) {
		
		
		System.out.println("Odd Number : using for loop");

		for (int i = 0; i <= 200; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
				}
		}
		System.out.println(".....");
		
		System.out.println("=======================================");
		
		System.out.println("Odd Number : using while loop");
		
		int j=0;
		while(j<=20) {
			if(j%2 !=0) {
				System.out.print(j + ", ");
				}
			j++;
			
		}
		System.out.println(".....");
		
		System.out.println("=======================================");
		
		int k=1;
		while(k<=20) {
			System.out.print(k +", ");
			k+=2;
		
		}
		
		
		
		
	}
}
