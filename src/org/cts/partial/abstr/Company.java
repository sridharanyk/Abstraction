package org.cts.partial.abstr;

public class Company extends Employee {

	@Override
	public void empName() {
		
		System.out.println("Employee name is Dutee Chand");
	}

	@Override
	public void empAge() {
		
		System.out.println("Employee Age is 24");
	}
	public static void main(String[] args) {
		Company c=new Company();
		c.empId();
		c.empName();
		c.empAge();
	}
	

}
