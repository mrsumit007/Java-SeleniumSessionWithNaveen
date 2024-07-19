package encaptulationConcept;

public class EmployeeTest {

	public static void main(String[] args) {
		
// Setting the value using parameterized Constructor 	
	Employee e1= new Employee("Rahul",20,"986655444");
	e1.setName("Raj");
	System.out.println("   Name   "+e1.getName()+ "  Age   " + e1.getAge() + "   Phone number    "+ e1.getPhonenumber());
	
	
// Setting the value using Setter Method for default constructor 
	Employee e2= new Employee();
	e2.setName("TOM");
	e2.setAge(45);
	e2.setPhonenumber("5555555555");
	System.out.println("   Name   "+e2.getName()+ "  Age   " + e2.getAge() + "   Phone number    "+ e2.getPhonenumber());
	
	}

}
