package encaptulationConcept;

public class Employee {

	private String name;
	private int age;
	private String phoneNumber;
	
	
// Parameterized Constructor
	public Employee (String name, int age, String phoneNumber) {
		this.name= name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
// Default constructor 	
	public Employee() {
		
	}
	
	
// Getter & Setter Method
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
	public String getPhonenumber() {
		return phoneNumber;
	}
	public void setPhonenumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
		
}
