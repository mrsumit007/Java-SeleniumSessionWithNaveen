package encaptulationConcept;

public class Registration {
	
	private String name;
	private int age;
	private String companyName;
	private double salary;

// Constructor 
	
		public Registration(String name, int age, String companyName, double salary) {
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.companyName = companyName;
		}
		
// =======================================================================================================	
// Method to print the Value 
		
	public void test() {
		
		Object arr[]= {name, age, companyName, salary};	
		
		for (Object e : arr) {
			System.out.print(e.toString()+ "    ");
			
		}
		

	}
		
// =======================================================================================================		
// Getter and Setter Method
	
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
}
	                       
