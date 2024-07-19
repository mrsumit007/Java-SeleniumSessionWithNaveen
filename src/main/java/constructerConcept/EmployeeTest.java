package constructerConcept;



public class EmployeeTest {

	public static void main(String[] args) {
		
		String a[]= {"Reena", "Shivansh"};
		Employee e1= new Employee("Rahul","9833124364",30);

		e1.setSalary(500);
		e1.setFamily(a);
		
		//int d = E1.getSalary();
		//System.out.println(d);
		
		String b[]= {"Raj", "Jon"};
		Employee e2= new Employee("Renu",30,"123456789",5000,"XYH",b );
		
		e1.EmployeeDetails();
		e2.EmployeeDetails();
		
		///Print e2 Ph no
		String ph= e2.getPhoneNo();
		System.out.println(ph);
				
	}

}
