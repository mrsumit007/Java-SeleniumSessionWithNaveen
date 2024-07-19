
package javaSession;



public class MultipleClass {

	
	// Calling Maths Class method in main class
	
	public static void main(String[] args) {
		
		// initialing objects of Maths Class
		
		Maths MathsObj= new Maths();
		
        int a = Maths.inputNumber("Enter the Value of First Number");
        int b = Maths.inputNumber("Enter the Value of Second Number");

       
        // Static Object
        Maths.sum(b, b);
        
        
        // Non-Static Object
        MathsObj.substruct(a, b);
        MathsObj.multiplication(a, b);
		
		
	}

}
