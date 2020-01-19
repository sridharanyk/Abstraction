package org.hgs.full.abstr;

public class Company implements Client{

	//Move the cursor on the Company, it will show the add the unimplemented methods
	@Override
	public void clientId() {
		System.out.println("Client Id is 1234556789");
		
		
	}

	@Override
	public void clientName() {
		System.out.println("Client Name is Sanna Marin");
	}
	public static void main(String[] args) {
		Company c=new Company();
		c.clientId();
		c.clientName();
			
	}
	

}
