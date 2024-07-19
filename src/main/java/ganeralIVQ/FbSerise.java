package ganeralIVQ;

public class FbSerise {
	
	// 0,1,2,3,5,8,13..... 
	// NextNumber = FirstNumber + SecondNumber
	
	static int firstNumber= 0;
	static int secondNumber= 1;
	static int nextNumber= 1;
	
	public static void fb(int num) {
		
		System.out.println("Febonicce Serise for number --> " +num);
		System.out.print(firstNumber+  ",  " );
		
		for(int i=0; i< num; i++) {
			nextNumber = firstNumber + secondNumber;
			System.out.print(nextNumber + ",  ");
			
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			
			}
		System.out.println(".........");
		}
		public static void main(String[] args) {
			
			//FbSerise obj = new FbSerise();
			
			FbSerise.fb(3);
			
		
	}
	

}		
		
	
	


