package oop;

public class VIPCustomer {
private String custName;
public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}

public double getCreditLimit() {
	return creditLimit;
}

public void setCreditLimit(double creditLimit) {
	this.creditLimit = creditLimit;
}

public String getCustEmail() {
	return custEmail;
}

public void setCustEmail(String emailAddress) {
	this.custEmail = emailAddress;
}

private double creditLimit;
private String custEmail;


public VIPCustomer(){
	this("genVIP001",500.00D,"novipemail@email.com");
	System.out.println("1 param called");
}

public VIPCustomer(String custName, String emailAddress) {
	this(custName,500.00D,emailAddress);
	System.out.println("2 param called");
}

public VIPCustomer(String custName, double creditLimit, String emailAddress) {
	this.custName = custName;
	this.creditLimit = creditLimit;
	this.custEmail = emailAddress;
	System.out.println("3 Param called");
}

 
}
