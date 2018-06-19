package bankingApp;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions;
	
	public Customer(String name, double initialAmount) {
		super();
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransactions(initialAmount);
	}

	public static  Customer createCustomer(String names, double initialAmount){
		return new Customer(names, initialAmount);
	}

	public String getName() {
		return name;
	}

	public void addTransactions(double transactions) {
		this.transactions.add(Double.valueOf(transactions));  //Autoboxing
	}
	
	public ArrayList<Double> getAllCustTransactions(){
		return transactions;
	}
}