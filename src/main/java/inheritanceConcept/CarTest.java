package inheritanceConcept;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println("Car Max Speed--> " +Car.maxSpeed);
		c.start();//individual
		c.stop(); //Individual
		c.engine(); //Individual
		c.heavywaight(); //Inherited
		Car.bulling();
		int billing = Car.bulling();
		System.out.println(billing);
		c.XYZ();
		
		System.out.println("============================");
		BMW b= new BMW();
		System.out.println("BMW Max Speed -->"+ b.maxSpeed );
		b.start(); // Inherited
		b.stop(); //Individual
		b.antithapt();  //Individual
		b.engine();  //Inherited
		BMW.bulling();
		
		System.out.println("============================");
		Audi a= new Audi();
		// Car.maxSpeed = 400;  
		System.out.println(Car.maxSpeed); // Static variable : maxSpeed
		a.autogare();
		a.engine();
		a.start();
		a.stop();
		
		
		System.out.println("============================");
		// Child class object can refer to grand parent reference variable
		a.heavywaight();
		
		System.out.println("============================");
		Vehicle v= new Vehicle();
		v.heavywaight();
		
		// Top Casting - Child class object can be referred to parent class object  
		System.out.println("============================");
		Car c1= new BMW();
		c1.stop(); // BMW Stop Method
		
		// Down Casting - Parent class object can be referred to Child class object  
		System.out.println("============================");
		//BMW b1= (BMW) new Car(); // loss of data
		//b1.stop(); // BMW Stop Method
		
	
	}

}
