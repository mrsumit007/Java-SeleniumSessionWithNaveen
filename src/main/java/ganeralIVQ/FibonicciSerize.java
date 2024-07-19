package ganeralIVQ;

public class FibonicciSerize {

	public FibonicciSerize(int count) {
		

		int firstNumber = 0;
		int secondNumber = 1;

		int nextNumber ;

		System.out.print(" Fibonacci Serise: ");
		System.out.print(firstNumber + ", ");
	

		for (int i = 0; i <= count - 2; i++) {

			nextNumber = firstNumber+ secondNumber;
			System.out.print(nextNumber + ", ");
			
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			
			
		}
		System.out.println(".....");
	}
}
		
		
