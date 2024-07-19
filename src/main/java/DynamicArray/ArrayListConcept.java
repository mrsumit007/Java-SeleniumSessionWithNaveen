package DynamicArray;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(900);
		ar.add(300);
		ar.add(800);
		ar.add(300);
		
		System.out.println(ar.size());
		System.out.println(ar);
		System.out.println(ar.get(0));
		Collections.sort(ar);
		System.out.println(ar);
		
////Duplicate Elements: Write a Java program to find duplicate elements in an array.
//		int count =0;
//		int i;
//		for(i=0; i>ar.size();i++) {
//			ar.get(i) = ar.get(i+1);
//			count++;
//			
//		}
//			if(count>=2) {
//				System.out.println("Duplicate Numbers are: -  ");
//			}
			
		

	}

}
