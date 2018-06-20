package ds.arraylistboxing.bankingapp;

import java.util.ArrayList;

public class Branch {
	private String branchName;
	private ArrayList<Customer> customersList;

	public Branch(String branchName, ArrayList<Customer> customersList) {
		this.branchName = branchName;
		customersList = new ArrayList<Customer>();
	}

	public Branch(String branchName) {
		this.branchName = branchName;
		customersList = new ArrayList<Customer>();
	}

	public String getBranchName() {
		return branchName;
	}

	public Branch addBranch(String bName,
			ArrayList<Customer> customersList) {
		return new Branch(bName, customersList);
	}

	public static Branch addBranch(String bName) {
		return new Branch(bName);
	}

	public boolean newCustomer(String name, double transactions) {
		Customer foundUser = findCustomer(name);
		if (foundUser != null) {
			System.out.println("Sorry Customer already exist.");
			return false;
		} else {
			customersList.add(new Customer(name, transactions));
			System.out.println("New Customer '" + name
					+ "' added to Branch '" + getBranchName() + "'.");
			return true;
		}
	}

	public Customer findCustomer(String name) {
		for (int i = 0; i < customersList.size(); i++) {
			Customer theCustomer = customersList.get(i);
			if (theCustomer.getName().equals(name)) {
				return theCustomer;
			}
		}
		return null;
	}

	public ArrayList<Customer> getCustomersList() {
		return customersList;
	}

	public boolean addCustomerTrans(String name, double trans) {
		Customer foundUser = findCustomer(name);
		if (foundUser != null) {
			foundUser.addTransactions(Double.valueOf(trans)); //Using AutoBoxing
			System.out.println("Transaction added to Customer :" + name);
			return true;
		} else{
			System.out.println("Cannot find User");
			return false;
		}
	}

}