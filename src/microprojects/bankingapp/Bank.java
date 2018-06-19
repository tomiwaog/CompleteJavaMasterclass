package microprojects.bankingapp;

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
		Branch theBranch = findBranch(branchName);
		if (theBranch != null) {
			return theBranch.newCustomer(customerName, initialAmount);
		}
		return false;
	}

	public boolean addCustTrans(String branchName, String custName,
			Double transaction) {
		Branch currBranch = findBranch(branchName);
		if (currBranch != null) {
			return currBranch.addCustomerTrans(custName, transaction);
		}
		return false;
	}

	public boolean listCustomers(String branchName, boolean showTransaction) {
		Branch theBranch = findBranch(branchName);
		if (theBranch != null) {
			System.out.println("Customer details for branch : "
					+ theBranch.getBranchName());
			ArrayList<Customer> branchCustomers = theBranch.getCustomersList();

			for (int i = 0; i < branchCustomers.size(); i++) {
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer " + (i+1) +": "+branchCustomer.getName());

				if (showTransaction) {
					System.out.println("Transactions for "
							+ branchCustomer.getName() + ": ");
					ArrayList<Double> customerTranss = branchCustomer
							.getAllCustTransactions();
					for (int j = 0; j < customerTranss.size(); j++) {
						System.out.println("["+(j + 1) + "] Amount "
								+ customerTranss.get(j));
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
