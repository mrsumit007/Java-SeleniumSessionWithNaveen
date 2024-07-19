package constructerConcept;

import java.util.Arrays;

public class Employee {
	private String name;
	private int age;
	private String phoneNo;
	private int salary;
	private String company;
	private String family[];
	
	public Employee(String name,String phoneNo, int age) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.salary = 0;
		this.company = null;
		this.family=null;

	}

	public Employee(String name, int age, String phoneNo, int salary, String company,String family[] ) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.salary = salary;
		this.company = company;
		this.family=family;
		//System.out.println(name + "   "+age+ "   "+ phoneNo+ "    "+salary +"        "+ company + "   "+ Arrays.toString(family) );
	}


	
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

//	public int getSalary() {
//		return salary;
//	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String[] getFamily() {
		return family;
	}

	public void setFamily(String[] family) {
		this.family = family;
	}

	// Method to display details
	public void EmployeeDetails(){
		System.out.println(name + "   "+age+ "   "+ phoneNo+ "    "+salary +"        "+ company + "   "+ Arrays.toString(family) );
		System.out.println(name + "   "+age+ "   "+ phoneNo+ "    "+ company + "   "+ Arrays.toString(family) );
	}

}
