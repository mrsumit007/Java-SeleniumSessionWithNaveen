package inheritanceConcept;

public class BMW extends Car{
	
	int maxSpeed= 250;
	
//	@Override
//	public void start() {
//		System.out.println("BMW Start Method");
//	}
	@Override
	public void stop() {
		System.out.println("BMW Stop Method");
	}
	
	
	public void antithapt() {
			System.out.println("BMW AntiTheft Method");
	}
	
}
