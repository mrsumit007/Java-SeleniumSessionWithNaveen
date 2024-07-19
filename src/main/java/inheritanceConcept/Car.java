package inheritanceConcept;

public class Car extends Vehicle{
	static final int maxSpeed =180;
	
	public void start() {
		System.out.println("Car Start Method");
	}
	public void stop() {
		System.out.println("Car Stop Method");
	}
	public void engine() {
		System.out.println("Car Engine Method");
	}
	
// Static Method	
	public static int bulling() {
		System.out.println("Car Bulling Method");
		return(100);
	}
	
// Private Method	
		private void test() {
			System.out.println("Car test Method");
		}
		public void XYZ() {
		Car c= new Car();
		c.test();
		}
}
