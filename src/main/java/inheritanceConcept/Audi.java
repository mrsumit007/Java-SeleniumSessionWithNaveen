package inheritanceConcept;

public final class Audi extends Car {

//	final:
//		1. final constants -
//		2. final class can not be Parent class --> Preventing Inheritance
//		3. final method can not be overridden --> preventing method overriding

	@Override
	public void start() {
		System.out.println("Audi Start Method");
	}
	@Override
	public void stop() {
		System.out.println("Audi Stop Method");
	}

	public void autogare() {
		System.out.println("Audi AutoGare Method");
	}
}
