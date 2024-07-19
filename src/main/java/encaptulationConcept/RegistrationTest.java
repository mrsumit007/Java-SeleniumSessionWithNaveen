package encaptulationConcept;

import java.util.Arrays;

public class RegistrationTest {

	public static void main(String[] args) {

		System.out.println("Name    Age   CompanyName    Salary}");	
		
		
		Registration E1 = new Registration("Rahul", 30, "ABC", 5000);
		E1.test();
		System.out.println();
		Registration E2 = new Registration("Sumi", 40, "ABC", 15000);
		E2.test();

System.out.println('\n'+ '\t'+"==========================================================");
// Print using Getter & Setter Method 
		
		System.out.println("Print using Getter & Setter Method " + '\n');
		System.out.println("E1 Name --> " + E1.getName() );
		System.out.println("E1 Age --> " + E1.getAge() );
		System.out.println("E1 Age --> " + E1.getCompanyName());
		
		System.out.println("=========New Values============" );

		E1.setName("Raj");
		System.out.println("E1 Name --> " + E1.getName() );
		E1.setAge(45);
		System.out.println("E1 Age --> " + E1.getAge() );

		E1.setCompanyName("XYZ");
		System.out.println("E1 Age --> " + E1.getCompanyName());
		E1.setSalary(6000);
		System.out.println("E1 Age --> " + E1.getSalary());
		 

	}

	
}
