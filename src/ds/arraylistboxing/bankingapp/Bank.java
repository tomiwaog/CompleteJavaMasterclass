package ds.arraylistboxing.bankingapp;

import java.util.ArrayList;

public class Bank {
	private String bankName;
	private ArrayList<Branch> branchList;

	public Bank(String bankName) {
		super();
		this.bankName = bankName;
		this.branchList = new ArrayList<Branch>();
	}

	public String getBankName() {
		return bankName;
	}

	public boolean addBranch(String branchName) {
		if (findBranch(branchName) == null) {
			branchList.add(new Branch(branchName));
			System.out.println("Branch: "+branchName+" added successfully");
			return true;
		} else {
			System.out.println("Branch name already exist");
			return false;
		}
	}

	public Branch findBranch(String branchName) {
		for (int i = 0; i < branchList.size(); i++) {
			Branch currBranch = branchList.get(i);
			if (currBranch.getBranchName().equals(branchName)) {
				return currBranch;
			}
		}
		return null;
	}

	public boolean addCustomer(String branchName, String customerName,
			double initialAmount) {
		//IF branch is found, add customer to the found branch
		Branch foundBranch = findBranch(branchName);
		if (foundBranch != null) {
			//Adds customer to branch returned by findBranch(x)
			return foundBranch.newCustomer(customerName, initialAmount);
		}
		return false;
	}

	public boolean addCustTransaction(String branchName, String custName,
			Double transaction) {
		Branch foundBranch = findBranch(branchName);
		if (foundBranch != null) {
			return foundBranch.addCustomerTrans(custName, transaction);
		}
		return false;
	}

	public boolean listCustomers(String branchName, boolean showTransaction) {
		Branch foundBranch = findBranch(branchName);
		if (foundBranch != null) {
			System.out.println("Customer details for branch '"
					+ foundBranch.getBranchName()+"': ");
			//Saves the list of Customers in foundBranch 
			ArrayList<Customer> branchCustomers = foundBranch.getCustomersList();

			//For each Customer in Branch.
			for (int i = 0; i < branchCustomers.size(); i++) {
				Customer currBranchCustomer = branchCustomers.get(i);
				System.out.println("Customer " + (i+1) +": "+currBranchCustomer.getName());

				//If Show Transaction... iterate in subobject in each i (branch)
				if (showTransaction) {
					System.out.println("Transactions for "
							+ currBranchCustomer.getName() + ": ");
					//Since each customer has an array of Transactions (Double type)
					ArrayList<Double> customerTrans = currBranchCustomer
							.getAllTransactions();
					for (int j = 0; j < customerTrans.size(); j++) {
						System.out.println("["+(j + 1) + "] Amount "
								+ customerTrans.get(j).doubleValue()); //Un-boxing from Double to double
					}
					System.out.println("\n");
				}
			}
			return true;
		} else {
			System.out.println("Invalid Branch entered! Please Re-check Bank Name");
			return false;
		}
	}
}
