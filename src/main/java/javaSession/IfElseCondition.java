package javaSession;

public class IfElseCondition {

	public static void main(String[] args) {
		
		        int Number = 10;

		        // If statement with & , && (logical AND), |, || (logical Or ) operator
		        // & , | operator -- 
		       
		       if(Number >0 && Number %2==0) { 
		    	   System.out.println("The number is positive and even number");
		       }
		       else {
		    	   System.out.println("Number is not positive and not even");
		       }
		        
		       
		        // If statement with || (logical OR) operator
		       if(Number <0 || Number %2!=0){
		    	   System.out.println("Number is either negative or odd ");
		       }
		       else {
		    	   System.out.println("Number is either not negative or not odd ");
		       } 
		        
		 }
}