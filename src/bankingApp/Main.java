package bankingApp;

public class Main {

	public static void main(String[] args) {
		Bank nationwideBank = new Bank("Nationwide Building Society");

		nationwideBank.addBranch("Uxbridge");
		nationwideBank.addCustomer("Uxbridge", "Tomiwa Ogunbamowo", 1000.00);
		nationwideBank.addCustomer("Uxbridge", "Hannan Quershi", 500.00);
		nationwideBank.addCustomer("Uxbridge", "David Lammy", 700.00);
		nationwideBank.addCustomer("Uxbridge", "Tony Robins", 750.00);

		nationwideBank.addBranch("Nationwide West Drayton");
		nationwideBank.addCustomer("Nationwide West Drayton", "Malcom Little", 550.55);
		nationwideBank.addCustomer("Nationwide West Drayton", "Marcus Garvey", 350.44);
	
		nationwideBank.addCustTrans("Uxbridge", "Tomiwa Ogunbamowo", 55.00);
		nationwideBank.addCustTrans("Uxbridge", "Tomiwa Ogunbamowo", 545.00);

		System.out.println("\n");
		nationwideBank.listCustomers("Uxbridge", true);
		nationwideBank.listCustomers("Nationwide West Drayton", true);
		

		//Test Bank CReation
		if (nationwideBank.addBranch("Hayes")){
			System.out.println("Hayes Bank created!");
		}
		
		//Test adding of duplicate branch
		if (!nationwideBank.addBranch("Hayes")){
			System.out.println("Bank already exist!");
		}
		
		//Test invalid Branch name
		if (!nationwideBank.addCustomer("Hayess", "Sandra", 300.00)){
			System.out.println("Bank Branch doesn't exist!.");
		}
		
		//Test Transaction add - invalid Customer name in Selected Branch
		if (!nationwideBank.addCustTrans("Hayes", "Tomiwa Ogunbamowo", 1900.03)){
			System.out.println("Customer does not exist at Branch");
		}
		
		//Test adding duplicate customer to existing branch
		if (nationwideBank.addCustomer("Uxbridge", "Tomiwah Ogunbamowo", 555.55)){
			System.out.println("New Customer added");
		}
		else
			System.out.println("Already exist in that Branch");
	}

}
