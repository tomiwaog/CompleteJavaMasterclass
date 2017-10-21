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
}

public VIPCustomer(String custName, String emailAddress) {
	this(custName,500.00D,emailAddress);
	this.custName = custName;
	this.custEmail = emailAddress;
}

public VIPCustomer(String custName, double creditLimit, String emailAddress) {
	this.custName = custName;
	this.creditLimit = creditLimit;
	this.custEmail = emailAddress;
}

 
}
