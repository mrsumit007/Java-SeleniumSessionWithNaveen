package ExceptionHandelling;
public class ExceptionTryCatch {
	
	String Name; // Global Variable

	public static void main(String[] args) {

		int arr[] = { 1, 2, 6 };
		System.out.println("Exception Handelling");
		
		ExceptionTryCatch obj = new ExceptionTryCatch();

		try {
			// int i =9/0; // ArithmeticException
			// arr[4]=8; // ArrayIndexOutOfBoundsException
			
			obj= null;
			obj.Name = "TOM"; // null * TOM = null  / NullPointerException:
			 
			//System.out.println(Name);
			System.out.println("Hi");
			
		} 
		
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(" This is ArithmeticException:");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException");

		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointerException:");
		}
// Exception Hierarchy --->  Object -> Throwable -> Exception --> ArrayIndexOutOfBoundsException / ArithmeticException  /........
		
		catch (Exception e) {  // Exception is supper class
			e.printStackTrace();
			System.out.println(" This is Exception:");
		}
		catch (Throwable e) {  // Throwable is supper class
			e.printStackTrace();
			System.out.println(" This is Throwable:");
		}
		System.out.println("Bye");
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		finally will always be executed -- it always written with try and catch block
//		UseCase- 
//		1.) To close all connections (DB, Excel, etc...)
//		2.) Close all browsers 
		
		finally {
			System.out.println("Finnally block");
		}

		

	}

}
