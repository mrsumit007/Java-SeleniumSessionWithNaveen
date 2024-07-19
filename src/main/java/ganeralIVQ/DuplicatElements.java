	package ganeralIVQ;
	
	import java.util.Arrays;
	
	public class DuplicatElements {
		
		
			public static void main(String[] args) {
			
			int ar[]= {5,9,5,1,3,0};
			
			System.out.println("Original Array -->" + Arrays.toString(ar));
			Arrays.sort(ar);
			
			System.out.println("========================================");
			
			// Printing array using "Arrays.toString" Method
			System.out.println("Shourted Array-->  "+ Arrays.toString(ar));
			
			
			System.out.println("========================================");
			
			// Printing array using for each loop Method
			for(int e : ar) {
				System.out.println(e);
			}
			
			System.out.println("========================================");
			
			// Printing array using for loop Method
			for(int i=0; i<ar.length; i++) {
				System.out.println(ar[i]);
			}
			
			System.out.println("========================================");
			// Printing Duplicate value in array 
			for (int i=0; i<ar.length-1; i++) {	 
				if (ar[i]== ar[i+1]) {
					System.out.println("Duplicat Elements in array are: -->" + ar[i]);
				}	
				
			}
	
		}
	
	}
