package oops;

public class Employee {

	public String Name;
	public int EmpId;
	public String Department;
	
	public Employee() {
		
		System.out.println("Default cons");
	}
	
	public Employee(String Name, int P2, String P3) {
	
	this.Name = Name;
	EmpId = P2;
	Department = P3;
	}
	
	public void Display() {
		
		System.out.println(Name);
		System.out.println(EmpId);
		System.out.println(Department);
		
	}
}
