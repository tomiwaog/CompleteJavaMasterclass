package oop;

public class BankAccount {

	private String accNum, phoneNum;
	private double accBalance;
	private String custName, custEmail;

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public void depositFunds(double money) {
		System.out.println("... Depositing £" + money);
		accBalance += money;
		System.out.println(getStatement());
	}

	public String getStatement() {
		return "You have available £" + accBalance + " available to spend";
	}

	public void withdrawFunds(double money) {
		System.out.println("... Withdrawing £" + money);
		if (this.accBalance - money >= 0) {
			accBalance -= money;

		} else
			System.out.println("Insufficient funds!");
		System.out.println(getStatement());
	}

	public BankAccount() {
		this("Gen001", 100, "Joe Britts", "joe_britts@hotmail.com",
				"077 343 2323");
		System.out.println("Empty Constructor called!");// thismust be
														// first in line
	}

	public BankAccount(String accNum, double accBalance, String custName,
			String custEmail, String phoneNum) {
		this.accNum = accNum;
		this.accBalance = accBalance;
		this.custName = custName;
		this.custEmail = custEmail;
		this.phoneNum = phoneNum;
		System.out.println("Full Parameterised Constructor called!");
	}

	public BankAccount(String custName, String custEmail, String phoneNum) {
		this("gen001", 100.00d, custName, custEmail,phoneNum);
		this.custName = custName;
		this.custEmail = custEmail;
		this.phoneNum = phoneNum;
		System.out.println("Three Param Constructor called");
	}
	
	public static void main(String[] args) {
		//BankAccount ab = new BankAccount();
		// BankAccount tom = new BankAccount("404023", 4440.00D,
		// "Tomiwa Ogunbamowo","tom@gmail.com", "07795550420W");

		BankAccount tit = new BankAccount("Titi Ogunbamowo","titi@gmail.com", "0779 435 3432");
		System.out.println(tit.getStatement());
	}
}
