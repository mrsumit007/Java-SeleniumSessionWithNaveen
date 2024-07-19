package javaSession;

public class ForEachLoop {

	public static void main(String[] args) {

		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[02] = 30;
		i[3] = 40;
		i[4] = 50;
		
		int len = i.length;

		int arr[] = {10,20,30,40}; 
		
		arr[2]=6;
		System.out.println(arr[2]);
		System.out.println(i[02]);

		System.out.println("=========================================");
	
       
		for (int j = 0; j < len; j++) {
			System.out.println("i" + "[" + j + "]" + "=" + i[j]);
		}
		System.out.println("=========================================");
		
		//for each loop
		// for each loop can only iterate over an array or an instance of java.lang.Iterable (e.g., ArrayList, LinkedList).
		
		int index=0;
			for( int e : i) {
			System.out.println("i"+"["+ index + "]" + "=" +e);
			index++;
		}

//		int k=10;
//		for(int e : k) {
//			System.out.println(i);
//		}
//		
		
	}

}
