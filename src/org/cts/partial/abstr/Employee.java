package org.cts.partial.abstr;

public abstract class Employee {
	
	//Non Abstract Method
	public void empId() {
		
		//Business Logic
		System.out.println("Employee Id is 123");
	}
	
	//Abstract Method
	public abstract void empName();
	public abstract void empAge();

}
