
public class StaticArray {

	public static void main(String[] args) {
		Object obj[] = new Object[4];
		obj[0] = 20;
		obj[1] = "Tom";
		obj[2] = "QA";
		
		for (int i=0; i<= obj.length-1 ; i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("************======================***************");
		
		
		for (Object e : obj) {
			System.out.println(e);
			
			if (e == "Tom") { // e.equals("Tom")
				break;
				
			}
		}
		
		
	}

}
