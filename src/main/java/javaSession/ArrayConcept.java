package javaSession;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array is used when the size is fix
		// Use Case - Month, Week, Movie ticket		
//Scenario 1:
		int i[]= new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		//i[3] = 40;  ArrayIndexOutOfBoundsException
		System.out.println("============Scenario 1:=====================");
		//System.out.println(i[3]); ArrayIndexOutOfBoundsException
		int len1 = i.length;
		System.out.println("Array Length" + " = " +len1);		
				for(int j=0; j< len1; j++) {
			System.out.println(i[j]);
		}
				
		System.out.println(Arrays.toString(i));
		
//Scenario 2:
//=======================================================================================================================
		
		System.out.println("================Scenario 2:==============================");	
		
		int arr[]= {10,20,30,40};
		int len2= arr.length;
		System.out.println("Array Length" + " = " + len2);
		for(int k=0; k<=len2-1; k++) { // for(int k=0; k<len2; k++) {
			System.out.println(arr[k]);
		}

//Scenario 3:
//=======================================================================================================================
		System.out.println("=================Scenario 3:=============================");
		//for each loop :
		
		for(int e : arr) { //  e will be used within for loop only
			System.out.println(e);
			if(e==arr[2]) { // Break at arr[2] - 10,20,30
				break;
			}
		}
//Scenario 4:
//=======================================================================================================================		
		System.out.println("=================Scenario 4:=============================");
		Object obj[] = new Object[4];
		obj[0]= "Tom";
		obj[1]= 7;
		obj[2]= 'c';
		obj[3]= 10.5;
		
		System.out.println(Arrays.toString(obj));
		
		for(Object e : obj) {  //  e will be used within for loop only
			System.out.println(e);
		}
		
//Scenario 5:
//=======================================================================================================================			
		System.out.println("=================Scenario 5:=============================");
		
		Object arr1[] = {"Hello",9,'f'};
		System.out.println(Arrays.toString(arr1)); //[Hello, 9, f]

//Scenario 6:
//=======================================================================================================================			
		System.out.println("=================Scenario 6:=============================");
		Object arr2[] = new Object[100];
		System.out.println("Table of Nine ");
		for (int g = 1; g <= 100; g++) {
			if (g % 9 == 0) {
				//System.out.println(g);
				arr2[g] = g;
				System.out.println(arr2[g]);
//				for (Object e:arr2) {
//					if (e!= null) {
//						System.out.println(e);
//					}
//				}
				
			}
		}
//=======================================================================================================================
	}

}
